package genshin;

import genshin.enums.Char;
import genshin.util.StatHandler;
import genshin.game.PossibleFinder.*;

import java.util.*;
import java.util.function.Consumer;

import static genshin.game.CharUtil.*;
import static genshin.game.CommandHandler.commandHandler;
import static genshin.game.PossibleFinder.*;


public class Game {

    public static short seed = 67;
    
    public static boolean isFirstRound = true;

    public static Consumer<String> printINFO = string -> System.out.println("< " + string + " >");

    public static Char hiddenCharacter = getRandomCharacter();

    public static boolean kill = false;

    public static void solveFor (Char test) {
        if (compareCharacterS(test)) {
            end = true;
        } else {
            System.out.println("Wrong!\n");
            score++;
        }
    }

    public static int score = 1;

    /**
     * This represents weather or not the current run is over or not
     * **/
    public static boolean end = false;

    /**
     * This represents weather or not the current game
     * is aborted by the user or not
     * **/
    public static boolean quit = false;


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
