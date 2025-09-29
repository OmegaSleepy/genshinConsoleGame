package clash;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

public class Holder {
    public static List<Card> characters = new ArrayList<>();
    static {

        for (Field field : Card.class.getDeclaredFields()) {
            // Only static fields of type Card
            if (Modifier.isStatic(field.getModifiers()) && field.getType() == Card.class) {
                try {
                    characters.add((Card) field.get(null)); // null because it's static
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static Map<String, Card> nameToCharacter = new HashMap<>();
    static {
        for(Card hero: characters){
            String heroName = hero.name.toLowerCase();
            heroName = heroName.replace(" ", "_");
            nameToCharacter.put(heroName, hero);
            for (String name : hero.alternativeNames) {
                name = name.replace(" ", "_");
                nameToCharacter.put(name.toLowerCase(),hero);
            }
        }
    }

    static void sortByVersion(){
        characters.sort(new Comparator<Card>() {
            @Override
            public int compare (Card o1, Card o2) {
                if(o1.elixir>o2.elixir){
                    return 1;
                } if(o1.elixir<o2.elixir){
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
        for(Card g: characters){
            String classNameWithSpaces = g.toString();
            StringBuilder className = new StringBuilder();

            for(Character c: classNameWithSpaces.toCharArray()){
                if(Character.isSpaceChar(c)){
                    className.append("_");
                } else{
                    className.append(c);
                }
            }

            System.out.println("nameToCharacter.put(\"" + g.name.toLowerCase() + "\",Card." + className + ");");

            if(g.hasAlternativeNames()){
                for(String alternativeName: g.alternativeNames){
                    System.out.println("nameToCharacter.put(\"" + alternativeName.toLowerCase() + "\",Card." + className + ");");
                }
            }
        }
    }

    public static void main (String[] args) {
        printMap();
    }
}
