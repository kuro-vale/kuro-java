// https://www.codewars.com/kata/5ae62fcf252e66d44d00008e/java

import java.util.Arrays;

public class Main {
    static int expressionsMatter(int a, int b, int c) {
        return Arrays.stream(new int[]{a * b * c, a + b + c, (a + b) * c, a * (b + c)}).max().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(expressionsMatter(5, 4, 3));
    }
}
