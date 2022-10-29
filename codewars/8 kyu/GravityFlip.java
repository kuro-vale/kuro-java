// https://www.codewars.com/kata/5f70c883e10f9e0001c89673/java
import java.util.Arrays;

public class Kata {
  public static int[] flip(char dir, int[] arr) {
      arr = Arrays.stream(arr).sorted().toArray();
      if (dir == 'L') {
          int[] reversed = new int[arr.length];
          int j = 0;
          for (int i = arr.length - 1; i >= 0; i--) {
              reversed[j] = arr[i];
              j += 1;
          }
          return reversed;
      } else if (dir == 'R') {
          return arr;
      } else {
          System.out.println("Please enter a valid direction ('L' or 'R')");
          return arr;
      }
  }
}
