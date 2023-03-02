package timbuchalka;

public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Andrew", 500);
        System.out.println("New score is " + newScore);

        calculateScore(200);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
// Method overloading allows a class to have multiple methods with the same name but different parameters.
    public static int calculateScore(int score) {
        System.out.println("Unknown player scored " + score + " points");
        return score * 1000;
    }
}
