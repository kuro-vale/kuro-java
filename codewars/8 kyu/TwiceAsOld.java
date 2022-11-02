//  https://www.codewars.com/kata/5b853229cfde412a470000d0/java

public class Main {
    static int TwiceAsOld(int dadYears, int sonYears) {
        return Math.abs(dadYears - sonYears * 2);
    }

    public static void main(String[] args) {
        System.out.println(TwiceAsOld(36, 7));
    }
}
