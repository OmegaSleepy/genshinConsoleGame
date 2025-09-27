package genshin;

import java.util.*;

enum Element {
    PYRO, CRYO, HYDRO, ELECTRO, GEO, ANEMO, DENTRO
}

enum Nation {
    MONSTADT, LYUE, INAZUMA, SUMERU, FONTAINE, NATLAN, NOD_KRAI, SNEZHNAYA, OUTSIDE
}

enum Weapon {
    POLEARM, CLAYMORE, CATALYST, BOW, SWORD
}


public class Game {
    static boolean isHard = true;

    static short seed = 67;
    static List<Element> possibleElements = new ArrayList<>();

    static {
        possibleElements.add(Element.DENTRO);
        possibleElements.add(Element.GEO);
        possibleElements.add(Element.CRYO);
        possibleElements.add(Element.PYRO);
        possibleElements.add(Element.ANEMO);
        possibleElements.add(Element.ELECTRO);
        possibleElements.add(Element.HYDRO);
    }

    static double maxVersion = 6.5;
    static double minVersion = 1.0;
    static List<Weapon> possibleWeapons = new ArrayList<>();

    static {
        possibleWeapons.add(Weapon.BOW);
        possibleWeapons.add(Weapon.CLAYMORE);
        possibleWeapons.add(Weapon.SWORD);
        possibleWeapons.add(Weapon.CATALYST);
        possibleWeapons.add(Weapon.POLEARM);
    }

    static List<Nation> possibleNations = new ArrayList<>();

    static {
        possibleNations.add(Nation.MONSTADT);
        possibleNations.add(Nation.LYUE);
        possibleNations.add(Nation.SNEZHNAYA);
        possibleNations.add(Nation.INAZUMA);
        possibleNations.add(Nation.SUMERU);
        possibleNations.add(Nation.NATLAN);
        possibleNations.add(Nation.FONTAINE);
        possibleNations.add(Nation.NOD_KRAI);
        possibleNations.add(Nation.OUTSIDE);
    }

    static boolean isFemale = false;
    static boolean isFiveStar;

    static List<String> nonNames = new ArrayList<>();

    static Char getRandomCharacter () {
        seed = (short) ((seed + 1) % Short.MAX_VALUE);
        new Random(seed);
        return Holder.characters.get(new Random(seed).getRandomCapped(Holder.characters.size()));
    }

    static Char getCharFromString (String name) {
        return Holder.nameToCharacter.get(name.toLowerCase());
    }

    static boolean containsChar (String name) {
        name = name.toLowerCase();
        if (Holder.nameToCharacter.containsKey(name)) {
            return true;
        }
        return false;
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

    static boolean compareCharacters (Char guess) {

        //name
        if (Objects.equals(guess.name, hiddenCharacter.name)) {
            System.out.print("Name is 🟩. ");
        } else {
            System.out.print("Name is 🟥. ");
            nonNames.add(guess.name);
        }
        System.out.println(capitalizeFirstChar(guess.name));

        if (guess.version == hiddenCharacter.version) {
            System.out.print("Version is 🟩. ");
            maxVersion = guess.version;
            minVersion = guess.version;

        } else if (guess.version > hiddenCharacter.version) {
            if (guess.version - hiddenCharacter.version > -0.5) {
                System.out.print("Version is lower <<. ");
            } else {
                System.out.print("Version is lower <. ");
            }
            if (maxVersion > guess.version) {
                maxVersion = guess.version;
            }
        } else {
            if ((guess.version - hiddenCharacter.version > 0.5)) {
                System.out.print("Version is higher >>. ");
            } else {
                System.out.print("Version is higher >. ");
            }
            if (minVersion < guess.version) {
                minVersion = guess.version;
            }
        }
        System.out.println(guess.version);
//        System.out.println(minVersion + " " + maxVersion);

        if (guess.element == hiddenCharacter.element) {
            System.out.print("Element is 🟩. ");
            possibleElements.clear();
            possibleElements.add(guess.element);
        } else {
            System.out.print("Element is 🟥. ");
            if (possibleElements.contains(guess.element)) {
                possibleElements.remove(guess.element);
            }
        }
        System.out.println(guess.element);

        if (guess.weapon == hiddenCharacter.weapon) {
            System.out.print("Weapon is 🟩. ");
            possibleWeapons.clear();
            possibleWeapons.add(guess.weapon);
        } else {
            System.out.print("Weapon is 🟥. ");
            if (possibleWeapons.contains(guess.weapon)) {
                possibleWeapons.remove(guess.weapon);
            }
        }
        System.out.println(guess.weapon);

        if (guess.nation == hiddenCharacter.nation) {
            System.out.print("Nation is 🟩. ");
            possibleNations.clear();
            possibleNations.add(guess.nation);
        } else {
            System.out.print("Nation is 🟥. ");
            if (possibleNations.contains(guess.nation)) {
                possibleNations.remove(guess.nation);
            }
        }
        System.out.println(guess.nation);

        if(!isHard){
            if (guess.isFemale == hiddenCharacter.isFemale) {
                System.out.print("Gender is 🟩. ");
                isFemale = true;
            } else {
                System.out.print("Gender is 🟥. ");
                isFemale = false;
            }
            if (guess.isFemale) {
                System.out.println("Female");
            } else {
                System.out.println("Male");
            }

            if (guess.isFiveStar == hiddenCharacter.isFiveStar) {
                System.out.print("Stars is 🟩. ");
                isFiveStar = guess.isFiveStar;
            } else {
                System.out.print("Stars is 🟥. ");
                isFiveStar = !guess.isFiveStar;
            }
            System.out.println(guess.isFiveStar);
        }


        if (guess.equals(hiddenCharacter)) {
            return true;
        } else {
            return false;
        }
    }

    static void printPossibleCharacters () {
        Holder.sortByVersion();
        for (Weapon weapon : possibleWeapons) {
            System.out.print(weapon + " ");
        }
        System.out.println();
        for (Nation nation : possibleNations) {
            System.out.print(nation + " ");
        }
        System.out.println();
        for (Element element : possibleElements) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("Min " + minVersion);
        System.out.println("Max " + maxVersion);

        if(!isHard){
            System.out.println("IsFemale? " + isFemale);
            System.out.println("IsFiveStar? " + isFiveStar);
        } else{
            System.out.println("<!Hardmode enabled, no gender or rarity value!>");
        }


        System.out.println("Possible characters: ");
        for (Char c : Holder.characters) {
            boolean isPossible = isIsPossible(c);
            if (isPossible) {
                System.out.println(c.name);
            }
        }
        System.out.println();
    }

    private static boolean isIsPossible (Char c) {
        boolean isPossible = true;
        if(nonNames.contains(c.name)){
            isPossible = false;
        } else if (!possibleWeapons.contains(c.weapon)) {
            isPossible = false;
        } else if (!possibleNations.contains(c.nation)) {
            isPossible = false;
        } else if (!possibleElements.contains(c.element)) {
            isPossible = false;
        } else if (isFemale != c.isFemale & !isHard) {
            isPossible = false;
        } else if (isFiveStar != c.isFiveStar & !isHard) {
            isPossible = false;
        } else if (maxVersion < c.version || minVersion > c.version) {
            isPossible = false;
        }
        return isPossible;
    }

    static boolean end = false;

    public static void main (String[] args) {

        if (!StatHandler.isValuesLegit()) {
            System.out.println("Discrepancy in statics");
        }

//        Holder.printMap();
        Scanner scanner = new Scanner(System.in);

        List<String> quits = new ArrayList<>();
        quits.add("quit");
        quits.add("q");
        quits.add("end");
        quits.add("exit");
        quits.add("alt+f4");

        int score = 1;
        boolean quit = false;

        while (!end) {
            String name = scanner.nextLine();
            boolean help = false;

            if (quits.contains(name.toLowerCase())) {
                end = true;
                quit = true;
                System.out.printf("You lost,\nyou quit (weak),\ncharacter was %s", hiddenCharacter.name);
                StatHandler.writeValues(0, false, true);
                break;
            }
            if (name.toLowerCase().equals("help")) {
                help = true;
                printPossibleCharacters();
            }

            if (containsChar(name)) {
                Char inputted = getCharFromString(name);
                if (compareCharacters(inputted)) {
                    end = true;
                } else {
                    System.out.println("Wrong!\n");
                    score++;
                }
                ;
            } else if (!help) {
                System.out.println("Error!\n");
            }
            help = false;
        }

        if (!quit) {
            StatHandler.writeValues(score, true, false);
            System.out.println("Won in " + score + " attempts!");
        }

        System.out.println(StatHandler.getInfo());


    }
}
