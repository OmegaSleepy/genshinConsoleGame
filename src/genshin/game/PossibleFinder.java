package genshin.game;

import genshin.Game;
import genshin.Holder;
import genshin.enums.Char;
import genshin.enums.Element;
import genshin.enums.Nation;
import genshin.enums.Weapon;

import java.util.ArrayList;
import java.util.List;

public class PossibleFinder {

    public static List<Element> possibleElements = new ArrayList<>();

    public static double maxVersion = getMaxVersion();
    public static double minVersion = 1.0;
    public static List<Weapon> possibleWeapons = new ArrayList<>();

    public static List<Nation> possibleNations = new ArrayList<>();

    public static List<String> nonNames = new ArrayList<>();


    public static void setMaxVersion (double maxVersion) {
        PossibleFinder.maxVersion = maxVersion;
    }

    public static void setMinVersion (double minVersion) {
        PossibleFinder.minVersion = minVersion;
    }

    public static double getMaxVersion(){
        double max = 1;
        for(Char c: Holder.characters){
            max = Math.max(max,c.version);
        }
        return max;
    }

    public static void repopulatePossible () {
        possibleNations.clear();
        possibleWeapons.clear();
        possibleElements.clear();
        nonNames.clear();

        possibleNations.add(Nation.MONSTADT);
        possibleNations.add(Nation.LIYUE);
        possibleNations.add(Nation.SNEZHNAYA);
        possibleNations.add(Nation.INAZUMA);
        possibleNations.add(Nation.SUMERU);
        possibleNations.add(Nation.NATLAN);
        possibleNations.add(Nation.FONTAINE);
        possibleNations.add(Nation.NOD_KRAI);
        possibleNations.add(Nation.OUTSIDE);

        possibleWeapons.add(Weapon.BOW);
        possibleWeapons.add(Weapon.CLAYMORE);
        possibleWeapons.add(Weapon.SWORD);
        possibleWeapons.add(Weapon.CATALYST);
        possibleWeapons.add(Weapon.POLEARM);


        Game.isFirstRound = true;

        maxVersion = getMaxVersion();
        minVersion = 1.0;

        possibleElements.add(Element.DENTRO);
        possibleElements.add(Element.GEO);
        possibleElements.add(Element.CRYO);
        possibleElements.add(Element.PYRO);
        possibleElements.add(Element.ANEMO);
        possibleElements.add(Element.ELECTRO);
        possibleElements.add(Element.HYDRO);
    }

    public static List<Char> possibleCharacters(List<Char> normal){
        List<Char> possible = new ArrayList<>();

        normal.stream()
                .filter(character -> !nonNames.contains(character.name))
                .filter(character -> possibleWeapons.contains(character.weapon))
                .filter(character -> possibleNations.contains(character.nation))
                .filter(character -> possibleElements.contains(character.element))
                .filter(character -> character.version > minVersion)
                .filter(character -> character.version < maxVersion)
                .forEach(possible::add);

        return possible;
    }
}
