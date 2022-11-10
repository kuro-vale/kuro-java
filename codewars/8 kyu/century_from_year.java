// https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097/java

public class Main {
    static int century(int number) {
        return (int) Math.ceil(number/100.0);
    }

    public static void main(String[] args) {
        System.out.println(century(2001));
    }
}
