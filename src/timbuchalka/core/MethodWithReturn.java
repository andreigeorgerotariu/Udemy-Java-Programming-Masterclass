package timbuchalka.core;

public class MethodWithReturn {
    public static void main(String[] args) { // This is a method with the name 'main'
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score " + highScore);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) { // int - returns int value back
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            return finalScore;
        } else {   // When the method is not 'void', it expects a return, ad all cases must be covered (in this case if gameOver is false)
            return -1; // Why are we returning -1? in programming terms negative 1 is conventionally used to indicate an error.
            // in searching algorithms negative 1 indicates an  invalid value or a value not found
        }
    }
}