package genshin;

import genshin.util.Compare;
import genshin.util.Random;
import genshin.util.StatHandler;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.Consumer;


public class Game {
    /**
     * Used to switch between "hard" and non-hard mode, the difference is in the amount of hints
     * @deprecated **/
    @Deprecated
    static boolean isHard = true;

    static short seed = 67;
    static List<Element> possibleElements = new ArrayList<>();

    static double maxVersion = getMaxVersion();
    static double minVersion = 1.0;
    static List<Weapon> possibleWeapons = new ArrayList<>();

    static List<Nation> possibleNations = new ArrayList<>();


    static boolean isFirstRound = true;

    static List<String> nonNames = new ArrayList<>();

    static Consumer<String> printINFO = string -> System.out.println("< " + string + " >");

    static double getMaxVersion(){
        double max = 1;
        for(Char c: Holder.characters){
            max = Math.max(max,c.version);
        }
        return max;
    }

    static void repopulatePossible () {
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


        isFirstRound = true;

        maxVersion = 6.5;
        minVersion = 1.0;

        possibleElements.add(Element.DENTRO);
        possibleElements.add(Element.GEO);
        possibleElements.add(Element.CRYO);
        possibleElements.add(Element.PYRO);
        possibleElements.add(Element.ANEMO);
        possibleElements.add(Element.ELECTRO);
        possibleElements.add(Element.HYDRO);
    }

    static Char getRandomCharacter () {
        seed = (short) ((seed + 1) % Short.MAX_VALUE);
        new genshin.util.Random(seed);
        return Holder.characters.get(new genshin.util.Random(seed).getRandomCapped(Holder.characters.size()));
    }

    static Char getCharFromString (String name) {
        name = name.replace(" ", "_");
        Char guess = Holder.nameToCharacter.get(name.toLowerCase());
        if(guess.equals(null)){
            return Char.KACHINA;
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

    static Char hiddenCharacter = getRandomCharacter();

    static Map<String, String> objectTruthTable = new HashMap<>();
    static Map<String, String> literalTruthTable = new HashMap<>();

    static {
        objectTruthTable.put("equal", "{key} is 🟩.");
        objectTruthTable.put("notEqual", "{key} is 🟥.");

        literalTruthTable.put("equal", "{key} is 🟩.");
        literalTruthTable.put("greater", "{key} is greater >.");
        literalTruthTable.put("lower", "{key} is lower <.");
    }

    static boolean compareCharacterS (Char guess) {
        isFirstRound = false;

        if (!Compare.Objects(Game.capitalizeFirstChar(guess.name),
                Game.capitalizeFirstChar(hiddenCharacter.name), "Name", objectTruthTable)) {
            nonNames.add(guess.name);
        }

        int cmp = Compare.Number(guess.version, hiddenCharacter.version, "Version", literalTruthTable);

        if (cmp == 0) {
            // guess == hidden, clamp both min/max to this exact value
            minVersion = guess.version;
            maxVersion = guess.version;
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

    static void printPossibleCharacters () {
        Holder.sortByVersion();
        printINFO.accept("========Help========");
        printINFO.accept("Possible Weapons:");
        for (Weapon weapon : possibleWeapons) {
            System.out.print(weapon + " ");
        }
        System.out.println();
        printINFO.accept("Possible Nations:");
        for (Nation nation : possibleNations) {
            System.out.print(nation + " ");
        }
        System.out.println();
        printINFO.accept("Possible Elements:");
        for (Element element : possibleElements) {
            System.out.print(element + " ");
        }
        System.out.println();
        printINFO.accept("Version range: ( " + minVersion + " < version < " + maxVersion + " )");

        int versionStep = -1; // start below any real version
        System.out.println();
        printINFO.accept("Possible characters");
        List<Char> possibleChar = possibleCharacters(Holder.characters);

        printINFO.accept("Total possible " + possibleChar.size());
        for (Char c : possibleChar) {
            int majorVersion = (int) Math.floor(c.version);
            if (majorVersion > versionStep) {
                System.out.printf("\n<%d.X>\n", majorVersion);
                versionStep = majorVersion; // sync with actual version
            }
            printINFO.accept(c.name);
        }

        printINFO.accept("========Help========");
        System.out.println();
    }


    //===SOLVING ALGORITHMS===

    /**
     * Solving algorithm thought of ChatGPT
     * @return {@code Char}
     * @since 1.3
     * @see #solveRandom()
     * **/
    static Char solveSmart () {
        // collect all possible candidates
        List<Char> possibleChar = possibleCharacters(Holder.characters);

        System.out.printf("<Total possible %s>\n", possibleChar.size());

        if (possibleChar.isEmpty()) {
            // fallback: shouldn’t normally happen
            return getRandomCharacter();
        }

        // if only 1 left, that's the answer
        if (possibleChar.size() == 1) {
            return possibleChar.getFirst();
        }

        // First round: aim for middle version (to split search space)
        if (isFirstRound) {
            double target = (minVersion + maxVersion) / 2.0;
            Char best = possibleChar.getFirst();
            double bestDiff = Math.abs(best.version - target);
            for (Char c : possibleChar) {
                double diff = Math.abs(c.version - target);
                if (diff < bestDiff) {
                    best = c;
                    bestDiff = diff;
                }
            }
            return best;
        }

        // Later rounds: try to maximize version narrowing
        double targetMid = (minVersion + maxVersion) / 2.0;
        Char best = possibleChar.getFirst();
        double bestScore = Double.MAX_VALUE;

        for (Char c : possibleChar) {
            double diff = Math.abs(c.version - targetMid);

            // Add small tie-breakers to encourage diverse exploration
            double tieBreaker = 0;
            if (possibleElements.size() > 1) tieBreaker += 0.2;
            if (possibleWeapons.size() > 1) tieBreaker += 0.1;
            if (possibleNations.size() > 1) tieBreaker += 0.05;

            double score = diff + tieBreaker;
            if (score < bestScore) {
                bestScore = score;
                best = c;
            }
        }

        return best;
    }



    /**
     * Solving algorithm based on total randomness
     * @return {@code Char}
     * @since 1.1
     * @see #solveSmart()
     * **/
    static Char solveRandom () {
        List<Char> possibleChar = possibleCharacters(Holder.characters);
        System.out.printf("<Total possible %s>\n", possibleChar.size());
        return possibleChar.get(new Random(seed).getRandomCapped(possibleChar.size()));

    }

    static boolean kill = false;

    static String[] commands = {"guess", "help", "quit", "kill", "solve", "stats", "wipe", "possible"};

    static void printPossibleCommands () {
        printINFO.accept("List of all commands");
        printINFO.accept(Arrays.toString(commands));
        printINFO.accept("Help for specific command: help -command");
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

    /**
     * Main logic for checking if a character is the {@code hiddenCharacter}
     * **/

    static void solveFor (Char test) {
        if (compareCharacterS(test)) {
            end = true;
        } else {
            System.out.println("Wrong!\n");
            score++;
        }
    }

    /**
     * Is the current score of the current game
     * **/

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
                printINFO.accept("You lost");
                printINFO.accept("you quit (weak)");
                printINFO.accept("character was");
                printINFO.accept(hiddenCharacter.name);
                StatHandler.writeValues(0, false, true);
                break;
            } else if (cmd.equals("kill")) {
                kill = true;
                quit = true;

                if (arguments.contains("-p")) {
                    System.out.println(StatHandler.getInfoWithColums());
                }

                break;
            } else if (cmd.equals("solve")) {
                if (arguments.contains("-random")) {
                    solveFor(solveRandom());
                } else if (arguments.contains("-1")) {
                    solveFor(solveSmart());
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
                    System.out.println(StatHandler.getInfo());
                } else {
                    System.out.println(StatHandler.getInfoWithColums());
                }
            } else if (cmd.equals("wipe")) {
                if (arguments.contains("-confirm")) {
                    StatHandler.generateFile();
                    StatHandler.fileValuesToVariables();
                    printINFO.accept("byeee stats :P");
                } else {
                    printINFO.accept("WARNING, YOU NEED TO USE <wipe -confirm> TO WIPE");
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
                            printINFO.accept("There is not a character with that name");
                        }
                    } else {
                        printINFO.accept("Too many arguments!");
                        printINFO.accept("Execute help -guess for more info!");
                    }

                } else {
                    solveFor(getCharFromString(command));
                }
            } else {
                System.out.println("Error in command!\n");
            }
        }
        if (!quit) {
            StatHandler.writeValues(score, true, false);
            System.out.println("\nWon in " + score + " attempts!");
        }
        end = true;
    }

    /**
     * Calculates all possible final fields of {@code Char}
     * **/
    private static List<Char> possibleCharacters(List<Char> normal){
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

    /**
     * This represents weather or not the current run is over or not
     * **/
    private static boolean end = false;

    /**
     * This represents weather or not the current game
     * is aborted by the user or not
     * **/
    private static boolean quit = false;


    /**
     * List of all possible abort commands that the user can execute
     * **/
    static List<String> quits = new ArrayList<>();

    static {
        quits.add("quit");
        quits.add("q");
        quits.add("end");
        quits.add("exit");
        quits.add("alt+f4");
    }

    public static void main (String[] args) {

        repopulatePossible();

        printINFO.accept("Write <help> for info on commands");
        boolean hasSeenTip = false;
        if (!StatHandler.isValuesLegit()) {
            printINFO.accept("Discrepancy in statics");
        }
        repopulatePossible();
        while (!kill) {
            hiddenCharacter = getRandomCharacter();
            commandHandler();

            if (kill) {
                break;
            }
            repopulatePossible();

            if (!hasSeenTip) {
                printINFO.accept("NEW GAME has automatically started");
                printINFO.accept("Use <kill> to quit game");
                printINFO.accept("This will not print again");
                hasSeenTip = true;
            }

        }
    }
}
