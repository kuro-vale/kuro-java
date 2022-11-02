//  https://www.codewars.com/kata/5bb904724c47249b10000131/java

public class Main {
    public static void main(String[] args) {
        System.out.println(points(new String[]
                {"1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4", "3:3", "4:4", "4:4"}));
    }

    public static int points(String[] games) {
        int score = 0;
        for (String game : games) {
            var points = game.split(":");
            int x = Integer.parseInt(points[0]);
            int y = Integer.parseInt(points[1]);
            if (x > y) {
                score += 3;
            } else if (x == y) {
                score += 1;
            }
        }
        return score;
    }
}
