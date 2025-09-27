import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CharAt {
    int index;
    char aChar;

    public CharAt (int i, char syllable) {
        this.index = i;
        this.aChar = syllable;
    }
}

public class HangedMan {
    static File file = new File("words.txt");
    static Scanner scanner;
    static List<String> words = new ArrayList<>();


    static {
        try {
            scanner = new Scanner(file);

            while (scanner.hasNext()) {
                words.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    static int random (int top) {
        return (int) (Math.random() * (10 ^ (String.valueOf(top).length())) % top);
    }

    static String word;
    static List<Character> syllables = new ArrayList<Character>();

    static String getWord () {
        return words.get(random(words.size()));
    }

    static int lives = 0;
    static int maxLives = 7;


    static void printLives (int change) {
        lives += change;
        System.out.print("Lives: <");

        for (int i = 0; i < maxLives; i++) {
            if (lives > i) {
                System.out.print("#");
            } else {
                System.out.print("_");
            }
        }

        System.out.println(">");

        if (hasLost()) {
            lose();
        }
    }


    static boolean end = false;

    static void lose () {
        end = true;
        System.out.println("You lost!\nThe word was: ");
        printWord();
        wantsToContinue();
        score--;
    }

    static boolean hasLost () {
        if (lives >= maxLives) {
            return true;
        }
        return false;
    }

    static boolean wantsToQuit = false;
    static int score = 0;

    static void wantsToContinue () {
        System.out.println("Do you want to continue?: (y/n)");
        Scanner scanner1 = new Scanner(System.in);
        if (scanner1.next().toCharArray()[0] != 'y') {
            wantsToQuit = true;
        }
    }

    static void win () {
        end = true;
        System.out.println("Congrats!\nThe word was :");
        printWord();
        wantsToContinue();
        score++;
    }

    static void printWord () {
        System.out.println(word);
    }

    static char getCharacter () {
        Scanner scanner1 = new Scanner(System.in);
        String syllable = scanner1.next();

        if (syllable.equals(word)) {
            win();
        }

        if (syllable.length() != 1) {
            return ' ';
        }
        char syllableReal = syllable.toCharArray()[0];
        syllableReal = Character.toLowerCase(syllableReal);
        if (!(syllableReal >= 'a' && syllableReal <= 'z')) {
            return ' ';
        }
        return syllableReal;
    }

    static char[] hollowWord = new char[0];

    static boolean checkForWin () {
        for (int i = 0; i < word.length(); i++) {
            if (hollowWord[i] != word.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    static void fillHollowWord () {
        hollowWord = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            hollowWord[i] = '_';
        }
        hollowWord[0] = word.toCharArray()[0];
        hollowWord[hollowWord.length - 1] = word.toCharArray()[word.length() - 1];
    }

    static void printPlayableWord () {


        System.out.print("Word: <");
        for (Character c : hollowWord) {
            System.out.print(c);
        }
        System.out.println(">");

        if (checkForWin()) {
            win();
        }

    }

    static boolean trySyllable (char syllable) {
        List<CharAt> changes = new ArrayList<>();

        for (int i = 0; i < syllables.size(); i++) {
            if (syllable == syllables.get(i)) {
                changes.add(new CharAt(i, syllable));
            }
        }
        if (changes.isEmpty()) {
            return false;
        }

        for (CharAt change : changes) {
            hollowWord[change.index] = change.aChar;
        }

        return true;
    }

    static void clearSyllables () {
        syllables = new ArrayList<Character>();
        hollowWord = new char[0];
    }

    static void reset () {
        end = false;
        word = getWord();
        clearSyllables();

        for (Character c : word.toCharArray()) {
            syllables.add(c);
        }

        lives = 0;
        printLives(0);
        fillHollowWord();
        printPlayableWord();
        System.out.println();
    }

    public static void main (String[] args) throws FileNotFoundException {

        while (!wantsToQuit) {
            reset();
            while (!end) {
                char syllable = getCharacter();
                if (trySyllable(syllable)) {
                    System.out.println("Correct!");
                    printLives(0);
                    printPlayableWord();
                } else if (syllable != ' ') {
                    System.out.println("Wrong!");
                    printLives(1);
                    printPlayableWord();
                } else if (!end) {
                    System.out.println("That was not the word!");
                    printPlayableWord();
                    printLives(1);
                }

            }
            printScore();
        }
        System.out.println("Thank you for playing! 😄");
    }

    static void printScore () {
        System.out.print("Score is <");
        System.out.print(score);
        System.out.println(">");
    }

}
