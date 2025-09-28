package genshin.util;

import java.util.Map;

public class Compare {


    //FOR INTEGER/DOUBLE

    //1 guess > hidden
    //0 guess == hidden
    //-1 guess < hidden

    //FOR STRINGS/ENUMS

    //true guess == hidden
    //false guess != hidden

    public static int Number (double guess, double target, String key, Map<String, String> messages){
        if (guess == target) {
            System.out.print(messages.get("equal").replace("{key}", key));
            System.out.println(" " + guess);
            return 0;
        } else if (guess > target) {
            System.out.print(messages.get("lower").replace("{key}", key));
            System.out.println(" " + guess);
            return 1;
        } else {
            System.out.print(messages.get("greater").replace("{key}", key));
            System.out.println(" " + guess);
        }
        return -1;
    }

    public static boolean Objects (Object guess, Object target, String key, Map<String, String> messages){
        if (guess.equals(target)) {
            System.out.print(messages.get("equal").replace("{key}", key));
            System.out.println(" " + guess);
            return true;
        } else {
            System.out.print(messages.get("notEqual").replace("{key}", key));
            System.out.println(" " + guess);
        }
        return false;
    }

}
