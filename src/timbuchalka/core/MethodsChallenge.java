package timbuchalka.core;

public class MethodsChallenge {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Andrew", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Alex", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Alin", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Mark", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int positionInHighScoreTable) {

        System.out.println(playerName + " managed to get into position " + positionInHighScoreTable + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }

        int position = 4; // assuming position 4 will be returned
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}