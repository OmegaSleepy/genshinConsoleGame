package genshin.game;

import genshin.Holder;
import genshin.enums.Char;
import genshin.enums.Element;
import genshin.enums.Nation;
import genshin.enums.Weapon;
import genshin.util.StatHandler;

import java.util.*;

import static genshin.Game.*;
import static genshin.game.CharUtil.containsChar;
import static genshin.game.CharUtil.getCharFromString;
import static genshin.game.PossibleFinder.*;
import static genshin.game.PossibleFinder.maxVersion;
import static genshin.game.PossibleFinder.minVersion;
import static genshin.game.PossibleFinder.possibleCharacters;
import static genshin.game.Solvers.solveRandom;
import static genshin.game.Solvers.solveSmart;

public class CommandHandler {

    public static void commandHandler () {

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

    public static String[] commands = {"guess", "help", "quit", "kill", "solve", "stats", "wipe", "possible"};

    public static List<String> quits = new ArrayList<>();

    static {
        quits.add("quit");
        quits.add("q");
        quits.add("end");
        quits.add("exit");
        quits.add("alt+f4");
    }

    public static void printPossibleCharacters () {
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

    public static void printPossibleCommands () {
        printINFO.accept("List of all commands");
        printINFO.accept(Arrays.toString(commands));
        printINFO.accept("Help for specific command: help -command");
    }

    public static void printHelp (List<String> arguments) {

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

}
