package timbuchalka;

public class OperatorsPartTwoChallenge {

    public static void main(String[] args) {

        boolean isCar = false;
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("WasCar is true");
        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = ageOfClient == 20 ? true : false;
        if (isEighteenOrOver) {
            System.out.println("You are old enough!");
        }

        // Challenge

        double firstVariable = 20.00d;
        double secondVariable = 80.00d;
        double result = ((firstVariable + secondVariable) * 100.00) % 40.00;
        boolean finalResult = (result == 0) ? true : false;
        if (!finalResult) {
            System.out.println("Got some remainder" + result);
        }


    }
}
