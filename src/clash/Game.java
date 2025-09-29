package clash;

import clash.util.Compare;
import clash.util.Random;
import clash.util.StatHandler;
import genshin.Char;

import java.util.*;


public class Game {
    static boolean isHard = true;

    static short seed = 67;

    static List<Card.Rarity> possibleRarity = new ArrayList<>();
    static List<Card.Type> possibleTypes = new ArrayList<>();
    static boolean isFirstRound = true;

    static int elixirMax = 10;
    static int elixirMin = 0;

    static List<String> nonNames = new ArrayList<>();

    static void repopulatePossible () {

        nonNames.clear();
        possibleRarity.add(Card.Rarity.COMMON);
        possibleRarity.add(Card.Rarity.RARE);
        possibleRarity.add(Card.Rarity.EPIC);
        possibleRarity.add(Card.Rarity.LEGENDARY);
        possibleRarity.add(Card.Rarity.CHAMPION);

        possibleTypes.add(Card.Type.TROOP);
        possibleTypes.add(Card.Type.SPELL);
        possibleTypes.add(Card.Type.BUILDING);

        elixirMax = 11;
        elixirMin = 0;

    }

    static Card getRandomCharacter () {
        seed = (short) ((seed + 1) % Short.MAX_VALUE);
        return Holder.characters.get(new Random(seed).getRandomCapped(Holder.characters.size()));
    }

    static Card getCharFromString (String name) {
        name = name.replace(" ", "_");
        Card guess = Holder.nameToCharacter.get(name.toLowerCase());
        if(guess.equals(null)){
            return Card.SKELETONS;
        }
        return guess;
    }

    static boolean containsChar (String name) {
        name = name.toLowerCase();
        name = name.replace(" ", "_");
        return Holder.nameToCharacter.containsKey(name);
    }

    static String capitalizeFirstChar (String string) {
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

    static Card hiddenCharacter = getRandomCharacter();

    static Map<String, String> objectTruthTable = new HashMap<>();
    static Map<String, String> literalTruthTable = new HashMap<>();

    static {
        objectTruthTable.put("equal", "{key} is 🟩.");
        objectTruthTable.put("notEqual", "{key} is 🟥.");

        literalTruthTable.put("equal", "{key} is 🟩.");
        literalTruthTable.put("greater", "{key} is greater >.");
        literalTruthTable.put("lower", "{key} is lower <.");
    }

    static boolean compareCharacterS (Card guess) {
        isFirstRound = false;

        if (!Compare.Objects(Game.capitalizeFirstChar(guess.name),
                Game.capitalizeFirstChar(hiddenCharacter.name), "Name", objectTruthTable)) {
            nonNames.add(guess.name);
        }
        if(Compare.Objects(guess.rarity,hiddenCharacter.rarity,"Rarity", objectTruthTable)){
            possibleRarity.clear();
            possibleRarity.add(guess.rarity);
        } else{
            if(possibleRarity.contains(guess.rarity)){
                possibleRarity.remove(guess.rarity);
            }
        }
        if(Compare.Objects(guess.type,hiddenCharacter.type,"Type", objectTruthTable)){
            possibleTypes.clear();
            possibleTypes.add(guess.type);
        } else{
            if(possibleTypes.contains(guess.type)){
                possibleTypes.remove(guess.type);
            }
        }
        int cmp = genshin.util.Compare.Number(guess.elixir, hiddenCharacter.elixir, "elexir", literalTruthTable);

        if (cmp == 0) {
            // guess == hidden, clamp both min/max to this exact value
            elixirMin = guess.elixir;
            elixirMax = guess.elixir;
        } else if (cmp < 1) {
            // guess < hidden → hidden is higher
            if (guess.elixir+1 > elixirMin) elixirMin = guess.elixir;
        } else {
            // guess > hidden → hidden is lower
            if (guess.elixir-1 < elixirMax) elixirMax = guess.elixir;
        }

        System.out.println();
        return guess.equals(hiddenCharacter);
    }

    static void printPossibleCharacters () {
        Holder.sortByVersion();
        System.out.println("<========Help========>");
        System.out.print("< Possible Types: ");
        for (Card.Type type : possibleTypes) {
            System.out.print(type + " ");
        }
        System.out.println(">\n");
        System.out.print("< Possible Rarities: ");
        for (Card.Rarity rarity : possibleRarity) {
            System.out.print(rarity + " ");
        }
        System.out.println(">\n");
        System.out.print(">\n");
        System.out.println("< Elixir range: ( " + elixirMin + " < elixir < " + elixirMax +
                " ) >");


        int elixirStep = -1; // start below any real version
        System.out.println("\n< Possible characters >");
        List<Card> possibleChar = new ArrayList<>();
        for (Card c : Holder.characters) {
            if (isIsPossible(c)) {
                possibleChar.add(c);
            }
        }
        System.out.printf("<Total possible %s>\n", possibleChar.size());
        for (Card c : possibleChar) {
            int elixir = c.elixir;
            if (elixir > elixirStep) {
                System.out.printf("\n<%d>\n", elixir);
                elixirStep = elixir; // sync with actual version
            }
            System.out.printf("<%s>\n", c.name);
        }

        System.out.println("<========Help========>");
        System.out.println();
    }


    //===SOLVING ALGORITHMS===

//    static Card solveSmart () {
//        // collect all possible candidates
//        List<Card> possibleChar = new ArrayList<>();
//        for (Card c : Holder.characters) {
//            if (isIsPossible(c)) {
//                possibleChar.add(c);
//            }
//        }
//
//        System.out.printf("<Total possible %s>\n", possibleChar.size());
//
//        if (possibleChar.isEmpty()) {
//            // fallback: shouldn’t normally happen
//            return getRandomCharacter();
//        }
//
//        // if only 1 left, that's the answer
//        if (possibleChar.size() == 1) {
//            return possibleChar.getFirst();
//        }
//
//        // First round: aim for middle version (to split search space)
//        if (isFirstRound) {
//            double target = (minVersion + maxVersion) / 2.0;
//            Card best = possibleChar.getFirst();
//            double bestDiff = Math.abs(best.version - target);
//            for (Card c : possibleChar) {
//                double diff = Math.abs(c.version - target);
//                if (diff < bestDiff) {
//                    best = c;
//                    bestDiff = diff;
//                }
//            }
//            return best;
//        }
//
//        // Later rounds: try to maximize version narrowing
//        double targetMid = (minVersion + maxVersion) / 2.0;
//        Card best = possibleChar.getFirst();
//        double bestScore = Double.MAX_VALUE;
//
//        for (Card c : possibleChar) {
//            double diff = Math.abs(c.version - targetMid);
//
//            // Add small tie-breakers to encourage diverse exploration
//            double tieBreaker = 0;
//            if (possibleElements.size() > 1) tieBreaker += 0.2;
//            if (possibleWeapons.size() > 1) tieBreaker += 0.1;
//            if (possibleNations.size() > 1) tieBreaker += 0.05;
//
//            double score = diff + tieBreaker;
//            if (score < bestScore) {
//                bestScore = score;
//                best = c;
//            }
//        }
//
//        return best;
//    }

    static Card solveRandom () {
        List<Card> possibleChar = new ArrayList<>();
        for (Card c : Holder.characters) {
            if (isIsPossible(c)) {
                possibleChar.add(c);
            }
        }
        System.out.printf("<Total possible %s>\n", possibleChar.size());
        return possibleChar.get(new Random(seed).getRandomCapped(possibleChar.size()));

    }


    static boolean kill = false;

    static String[] commands = {"guess", "help", "quit", "kill", "solve", "stats", "wipe", "possible"};


    static void printPossibleCommands () {
        System.out.println("< List of all commands > ");
        System.out.println(Arrays.toString(commands));
        System.out.println("\n< Help for specific command: help -command >");
    }

    static void printHelp (List<String> arguments) {

        if (arguments.isEmpty()) {
            printPossibleCommands();
        }

        Map<String, String> helpHelppers = new HashMap<>();
        helpHelppers.put("-solve", """
                < Enter < solve > for default algorithm to solve >
                < or use arguments -random -1 -2 -3 >
                < default is -random >""");
        helpHelppers.put("-quit", "< Enter < quit > to quit this run > \n" +
                "< Other possible syntax are: end, alt-f4, q >");
        helpHelppers.put("-guess", """
                < Format is < guess -character_name > >
                < or just < character_name > >""");
        helpHelppers.put("-kill", "< Enter < kill > to end the programme >\n" +
                "< Possible arguments: -p (to print stats) >");
        helpHelppers.put("-stats", "< Enter < print > to stats statistics >\n" +
                "< Possible arguments: -i (to print without columns) >");
        helpHelppers.put("-possible", "< Enter < possible > to print possible characters >");
        helpHelppers.put("-wipe", "< Enter < wipe -confirm > to wipe your safe file >");

        helpHelppers.put("-help", "< List of all commands >\n" + Arrays.toString(commands) +
                "\n< Help for specific command: help -command >");

        for (String argument : arguments) {
            if (helpHelppers.containsKey(argument)) {
                System.out.println(helpHelppers.get(argument));
            } else {
                System.out.println("< ERROR IN HELP SYNTAX >");
                printPossibleCommands();
            }
        }


    }

    static void solveFor (Card test) {
        if (compareCharacterS(test)) {
            end = true;
        } else {
            System.out.println("Wrong!\n");
            score++;
        }
    }

    static int score = 1;

    static void commandHandler () {

        Scanner scanner = new Scanner(System.in);
        end = false;
        score = 1;
        while (!end) {
            String command = scanner.nextLine();
            command = command.toLowerCase();
            String cmd = command.split(" ")[0];
            List<String> arguments = new ArrayList<>(Arrays.stream(command.split(" ")).toList());
            arguments.removeFirst();
            if (!arguments.isEmpty()) {
                System.out.println(arguments);
            }

            if (quits.contains(cmd.toLowerCase())) {
                end = true;
                quit = true;
                System.out.printf("< You lost >\n< you quit (weak) > \n< character was %s >\n", hiddenCharacter.name);
                genshin.util.StatHandler.writeValues(0, false, true);
                break;
            } else if (cmd.equals("kill")) {
                kill = true;
                quit = true;

                if (arguments.contains("-p")) {
                    System.out.println(genshin.util.StatHandler.getInfoWithColums());
                }

                break;
            } else if (cmd.equals("solve")) {
                if (arguments.contains("-random")) {
                    solveFor(solveRandom());
                } else if (arguments.contains("-1")) {
//                    solveFor(solveSmart());
                } else if (arguments.contains("-2")) {
                    solveFor(solveRandom());
                } else if (arguments.contains("-3")) {
                    solveFor(solveRandom());
                } else {
                    solveFor(solveRandom());
                }
            } else if (cmd.equals("possible")) {
                printPossibleCharacters();
            } else if (cmd.equals("help")) {
                printHelp(arguments);
            } else if (cmd.equals("stats")) {
                if (arguments.contains("-i")) {
                    System.out.println(genshin.util.StatHandler.getInfo());
                } else {
                    System.out.println(genshin.util.StatHandler.getInfoWithColums());
                }
            } else if (cmd.equals("wipe")) {
                if (arguments.contains("-confirm")) {
                    genshin.util.StatHandler.generateFile();
                    genshin.util.StatHandler.fileValuesToVariables();
                    System.out.println("< byeee stats :P >");
                } else {
                    System.out.println("< WARNING, YOU NEED TO USE <wipe -confirm> TO WIPE >");
                }
            } else if (cmd.equals("guess") || containsChar(command)) {

                if (cmd.equals("guess")) {
                    if (arguments.size() == 1) {
                        StringBuilder stringBuilder = new StringBuilder(arguments.toString());
                        stringBuilder.delete(0, 2);
                        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

                        String charName = stringBuilder.toString();
                        if (containsChar(charName)) {
                            solveFor(getCharFromString(charName));
                        } else {
                            System.out.println("< There is not a character with that name >");
                        }
                    } else {
                        System.out.println("<Too many arguments! > \n" +
                                "< Execute help -guess for more info! >");
                    }

                } else {
                    solveFor(getCharFromString(command));
                }
            } else {
                System.out.println("Error in command!\n");
            }
        }
        if (!quit) {
            genshin.util.StatHandler.writeValues(score, true, false);
            System.out.println("\nWon in " + score + " attempts!");
        }
        end = true;
    }

    private static boolean isIsPossible (Card c) {
        boolean isPossible = true;
        if (nonNames.contains(c.name)) {
            isPossible = false;
        } else if (!possibleRarity.contains(c.rarity)) {
            isPossible = false;
        } else if (!possibleTypes.contains(c.type)) {
            isPossible = false;
        } else if (elixirMin == elixirMax) {
            // Special case: only that exact elixir is allowed
            if (c.elixir != elixirMin) {
                isPossible = false;
            }
        } else {
            // Normal case: strictly inside bounds
            if (c.elixir <= elixirMin || c.elixir >= elixirMax) {
                isPossible = false;
            }
        }

        return isPossible;
    }

    static boolean end = false;
    static boolean quit = false;
    static List<String> quits = new ArrayList<>();

    static {
        quits.add("quit");
        quits.add("q");
        quits.add("end");
        quits.add("exit");
        quits.add("alt+f4");
    }

    public static void main (String[] args) {
        System.out.println(Holder.characters.size());

        repopulatePossible();

        System.out.println("< Write <help> for info on commands >");
        boolean hasSeenTip = false;
        if (!StatHandler.isValuesLegit()) {
            System.out.println("Discrepancy in statics");
        }
        repopulatePossible();
        while (!kill) {
            hiddenCharacter = getRandomCharacter();
            commandHandler();

            if (kill) {
                break;
            }
            repopulatePossible();
//            System.out.println(possibleNations);

            if (!hasSeenTip) {
                System.out.println("""
                        < NEW GAME has automatically started >
                        < Use <kill> to quit game >
                        < This will not print again >
                        """);
                hasSeenTip = true;
            }

        }


    }
}
