package genshin;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

public class Holder {
    public static List<Char> characters = new ArrayList<>();
    static {

        for (Field field : Char.class.getDeclaredFields()) {
            // Only static fields of type Char
            if (Modifier.isStatic(field.getModifiers()) && field.getType() == Char.class) {
                try {
                    characters.add((Char) field.get(null)); // null because it's static
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static Map<String, Char> nameToCharacter = new HashMap<>();
    static {
        for(Char hero: characters){
            nameToCharacter.put(hero.name.toLowerCase(), hero);
            for (String name : hero.alternativeNames) {
                nameToCharacter.put(name.toLowerCase(),hero);
            }
        }
    }

    static void sortByVersion(){
        characters.sort(new Comparator<Char>() {
            @Override
            public int compare (Char o1, Char o2) {
                if(o1.version>o2.version){
                    return 1;
                } if(o1.version<o2.version){
                    return -1;
                }
                int shorterCount = Math.min(o1.name.length(),o2.name.length());
                for (int i = 0; i < shorterCount; i++) {
                    if(o1.name.charAt(i)>o2.name.charAt(i)){
                        return 1;
                    } else if (o1.name.charAt(i)<o2.name.charAt(i)) {
                        return -1;
                    }
                }
                return 0;
            }
        });
    }

    static void printMap(){
        for(Char g: characters){
            String classNameWithSpaces = g.toString();
            StringBuilder className = new StringBuilder();

            for(Character c: classNameWithSpaces.toCharArray()){
                if(Character.isSpaceChar(c)){
                    className.append("_");
                } else{
                    className.append(c);
                }
            }

            System.out.println("nameToCharacter.put(\"" + g.name.toLowerCase() + "\",Char." + className + ");");

            if(g.hasAlternativeNames()){
                for(String alternativeName: g.alternativeNames){
                    System.out.println("nameToCharacter.put(\"" + alternativeName.toLowerCase() + "\",Char." + className + ");");
                }
            }
        }
    }

    public static void main (String[] args) {
        printMap();
    }
}
