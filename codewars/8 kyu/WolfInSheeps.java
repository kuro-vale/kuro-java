// https://www.codewars.com/kata/5c8bfa44b9d1192e1ebd3d15/java

import java.util.Arrays;

class ZywOo {
    public static String warnTheSheep(String[] array) {
        var wolf = Arrays.asList(array).indexOf("wolf");
        if (wolf == array.length - 1) {
            return "Pls go away and stop eating my sheep";
        } else {
            return "Oi! Sheep number " + (array.length - (wolf + 1)) + "! You are about to be eaten by a wolf!";
        }
    }
}
