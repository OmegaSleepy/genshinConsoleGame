package genshin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StatHandler {
    static int wins;
    static int winsAt1;
    static int winsAt2;
    static int winsAt3;
    static int winsAt4;
    static int winsAt5;
    static int winsAtMore;
    static int quits;
    static int totalGames;

    static File stats = new File("src/genshin/stats.txt");


    /*wins=0
    winsAt1=0
    winsAt2=0
    winsAt3=0
    winsAt4=0
    winsAt5=0
    winsAtMore=0
    quits=0
    totalGames=0*/

    static void fileValuesToVariables () {
        Scanner scanner;

        try {
            scanner = new Scanner(stats);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] args = line.split("=");
            int value = Integer.parseInt(args[1]);

            switch (args[0]) {
                case "wins":
                    wins = value;
                    break;
                case "winsAt1":
                    winsAt1 = value;
                    break;
                case "winsAt2":
                    winsAt2 = value;
                    break;
                case "winsAt3":
                    winsAt3 = value;
                    break;
                case "winsAt4":
                    winsAt4 = value;
                    break;
                case "winsAt5":
                    winsAt5 = value;
                    break;
                case "winsAtMore":
                    winsAtMore = value;
                    break;
                case "quits":
                    quits = value;
                    break;
                case "totalGames":
                    totalGames = value;
                    break;
                default:
                    System.out.println("Error in file format");
            }
        }


    }

    static public String getInfo () {
        return ("\nTotal games: " + totalGames + "\nWins/quits: " + wins + " / " + quits +
                "\nWins at tries:" +
                "\n1: " + winsAt1 +
                "\n2: " + winsAt2 +
                "\n3: " + winsAt3 +
                "\n4: " + winsAt4 +
                "\n5: " + winsAt5 +
                "\n>: " + winsAtMore);
    }

    static int maxBars = 10;

    static public int getMax(int[] numbs){
        int max = 0;
        for(Integer i: numbs){
            max = Math.max(max,i);
        }
        return max;
    }

    static public String getInfoWithColums () {
        int [] winsCollection = {winsAt1,winsAt2,winsAt3,winsAt4,winsAt5,winsAtMore};

        double barsPerWin = (double) maxBars /getMax(winsCollection);

//        int barLength = (int) Math.round(barsPerWin * winsCollection[j]);

        String [] bars = {"","","","","",""};
        for (int j = 0; j < winsCollection.length; j++) {
            int barLength = (int) Math.round(barsPerWin * winsCollection[j]);

            for (int o = 0; o < barLength; o++) {
                bars[j] += "#";
            }
            for (int o = barLength; o < maxBars +1; o++)  {
                bars[j] += " ";
            }

        }

        return ("<=====Statistics=====>" +
                "\nTotal games: " + totalGames + "\nWins/quits: " + wins + " / " + quits +
                "\nWins at tries:" +
                "\n1: " + bars[0] + winsAt1 +
                "\n2: " + bars[1] + winsAt2 +
                "\n3: " + bars[2] + winsAt3 +
                "\n4: " + bars[3] + winsAt4 +
                "\n5: " + bars[4] + winsAt5 +
                "\n>: " + bars[5] + winsAtMore +
                "\n<=====Statistics=====>\n");
    }

    static void writeValuesToFile () {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(stats);
            fileWriter.write("wins=" + wins + "\n");
            fileWriter.write("winsAt1=" + winsAt1 + "\n");
            fileWriter.write("winsAt2=" + winsAt2 + "\n");
            fileWriter.write("winsAt3=" + winsAt3 + "\n");
            fileWriter.write("winsAt4=" + winsAt4 + "\n");
            fileWriter.write("winsAt5=" + winsAt5 + "\n");
            fileWriter.write("winsAtMore=" + winsAtMore + "\n");
            fileWriter.write("quits=" + quits + "\n");
            fileWriter.write("totalGames=" + totalGames + "\n");
            fileWriter.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void generateFile () {
        try {
            stats.createNewFile();
            FileWriter fillTheNewFile = new FileWriter(stats);
            fillTheNewFile.write("wins=0\n" +
                    "winsAt1=0\n" +
                    "winsAt2=0\n" +
                    "winsAt3=0\n" +
                    "winsAt4=0\n" +
                    "winsAt5=0\n" +
                    "winsAtMore=0\n" +
                    "quits=0\n" +
                    "totalGames=0");
            fillTheNewFile.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    static boolean isValuesLegit () {
        int sumOfWins = winsAt1 + winsAt2 + winsAt3 + winsAt4 + winsAt5 + winsAtMore;
        int sumOfQuitsWins = wins + quits;
        if (wins != sumOfWins) {
            return false;
        }

        if (totalGames != sumOfQuitsWins) {
            return false;
        }
        return true;
    }

    static void writeValues (int score, boolean isWin, boolean isQuit) {
        totalGames++;
        if (isWin) {
            wins++;
            switch (score) {
                case 0:
                    System.out.println("Error, score of 0!");
                case 1:
                    winsAt1++;
                    break;
                case 2:
                    winsAt2++;
                    ;
                    break;
                case 3:
                    winsAt3++;
                    ;
                    break;
                case 4:
                    winsAt4++;
                    ;
                    break;
                case 5:
                    winsAt5++;
                    ;
                    break;
                default:
                    winsAtMore++;
                    break;
            }
        } else if (isQuit) {
            quits++;
        }

        writeValuesToFile();
    }

    static {
        if (!stats.exists()) {
            generateFile();
        } else {
            Scanner scanner = null;
            try {
                scanner = new Scanner(stats);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            if (!scanner.hasNext()) {
                generateFile();
            }
            scanner.close();
        }

        fileValuesToVariables();
    }
}
