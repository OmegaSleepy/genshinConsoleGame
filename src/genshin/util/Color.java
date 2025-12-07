package genshin.util;

public class Color {

    public static String red = "\\e[0;31m";
    public static String green = "\\e[0;32m";
    public static String reset = "\\e[0m.";

    public static String inRed(String string){
        return red + string + reset;
    }

    public static String inGreen(String string){
        return green + string + reset;
    }

}
