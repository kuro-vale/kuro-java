//  https://www.codewars.com/kata/5b73fe9fb3d9776fbf00009e/java

import java.util.Arrays;

public class Main {
    static int sumOfDifferences(int[] arr) {
        if (arr.length == 0) return 0;
        return Arrays.stream(arr).max().getAsInt() - Arrays.stream(arr).min().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(sumOfDifferences(new int[]{1, 2, 10}));
    }
}
