//  https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/java

public class Main {
    static String countingSheep(int num) {
        StringBuilder sheep = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            sheep.append(String.format("%d sheep...", i));
        }
        return sheep.toString();
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(2));
    }
}
