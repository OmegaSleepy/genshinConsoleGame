package genshin.game;

import genshin.Game;
import genshin.Holder;
import genshin.enums.Char;
import genshin.util.Color;
import genshin.util.Compare;

import java.util.HashMap;
import java.util.Map;

import static genshin.Game.hiddenCharacter;
import static genshin.Game.seed;
import static genshin.Game.isFirstRound;
import static genshin.game.PossibleFinder.*;
import static genshin.game.PossibleFinder.possibleNations;

public class CharUtil {
    public static Char getRandomCharacter () {
        seed = (short) ((seed + 1) % Short.MAX_VALUE);
        new genshin.util.Random(seed);
        return Holder.characters.get(new genshin.util.Random(seed).getRandomCapped(Holder.characters.size()));
    }

    public static Char getCharFromString (String name) {
        name = name.replace(" ", "_");
        Char guess = Holder.nameToCharacter.get(name.toLowerCase());
        if(guess.equals(null)){
            return Char.KACHINA;
        }
        return guess;
    }

    public static boolean containsChar (String name) {
        name = name.toLowerCase();
        name = name.replace(" ", "_");
        return Holder.nameToCharacter.containsKey(name);
    }

    public static String capitalizeFirstChar (String string) {
        string = string.toLowerCase();
        String[] names = string.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        for (String string1 : names) {
            stringBuilder.append(Character.toUpperCase(string1.charAt(0)));
            for (int i = 1; i < string1.length(); i++) {
                stringBuilder.append(string1.charAt(i));
            }
            stringBuilder.append(" ");
        }

        return stringBuilder.toString();
    }

    public static Map<String, String> objectTruthTable = new HashMap<>();
    public static Map<String, String> literalTruthTable = new HashMap<>();

    static {
        objectTruthTable.put("equal", "{key} is %s.".formatted(Color.inRed("#")));
        objectTruthTable.put("notEqual", "{key} is %s.".formatted(Color.inGreen("#")));

        literalTruthTable.put("equal", "{key} is %s.".formatted(Color.inRed("#")));
        literalTruthTable.put("greater", "{key} is greater >.");
        literalTruthTable.put("lower", "{key} is lower <.");
    }

    public static boolean compareCharacterS (Char guess) {
        isFirstRound = false;

        if (!Compare.Objects(capitalizeFirstChar(guess.name),
                capitalizeFirstChar(hiddenCharacter.name), "Name", objectTruthTable)) {
            nonNames.add(guess.name);
        }

        int cmp = Compare.Number(guess.version, hiddenCharacter.version, "Version", literalTruthTable);

        if (cmp == 0) {
            // guess == hidden, clamp both min/max to this exact value
            setMinVersion(guess.version);
            setMaxVersion(guess.version);
        } else if (cmp < 1) {
            // guess < hidden → hidden is higher
            if (guess.version+0.1 > minVersion) minVersion = guess.version;
        } else {
            // guess > hidden → hidden is lower
            if (guess.version-0.1 < maxVersion) maxVersion = guess.version;
        }
        minVersion = Math.round(minVersion * 10.0) / 10.0;
        maxVersion = Math.round(maxVersion * 10.0) / 10.0;

        if (Compare.Objects(guess.weapon, hiddenCharacter.weapon, "Weapon", objectTruthTable)) {
            possibleWeapons.clear();
            possibleWeapons.add(guess.weapon);
        } else {
            if(possibleWeapons.contains(guess.weapon)){
                possibleWeapons.remove(guess.weapon);
            }
        }

        if (Compare.Objects(guess.element, hiddenCharacter.element, "Element", objectTruthTable)) {
            possibleElements.clear();
            possibleElements.add(guess.element);
        } else {
            if(possibleElements.contains(guess.element)){
                possibleElements.remove(guess.element);
            }
        }

        if (Compare.Objects(guess.nation, hiddenCharacter.nation, "Nation", objectTruthTable)) {
            possibleNations.clear();
            possibleNations.add(guess.nation);
        } else {
            if(possibleNations.contains(guess.nation)){
                possibleNations.remove(guess.nation);
            }
        }

        System.out.println();
        return guess.equals(hiddenCharacter);
    }
}
