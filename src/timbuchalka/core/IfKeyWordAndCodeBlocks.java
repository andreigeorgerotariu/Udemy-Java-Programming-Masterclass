package timbuchalka.core;

public class IfKeyWordAndCodeBlocks {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 4000;
        int levelComplete = 5;
        int bonus = 100;

//        if (score == 5000) {
//            System.out.println("Your score was 5000");
//            System.out.println("This was executed!");
//        }

        if (score <= 5000) {
            System.out.println("Your score was less than 5000");
        } else {
            System.out.println("Your score is above 5000");
        }

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score is less than 1000");
        } else {
            System.out.println("Your score is above 5000");
        }

        if (gameOver == true) { // can be abbreviated to 'if (gameOver) {'
            int finalScore = score + (levelComplete * bonus);
            System.out.println("Your final score was " + finalScore);
        } // int savedFinalScore = finalScore; <- IntelliJ will display error on finalScore because everything created between code blockers ('{}') will be deleted after running the code.
        // in other words, you can't access variable created in the code block, outside the code blockers ('{}')

        // Challenge
        boolean secondGame = true;
        int secondScore = 10000;
        int secondLevelCompleted = 8;
        int secondBonus = 200;

        if (secondGame == true) {
            int finalScore = secondScore + (secondLevelCompleted * secondBonus);
            System.out.println("Your second final score was " + finalScore);
        }


    }

}
