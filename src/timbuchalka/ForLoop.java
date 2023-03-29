package timbuchalka;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }


//        for(init; termination; increment){
//        }
        for (int i = 0; i < 5; i++) {
//            System.out.println("loop " + i + " hello!");
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
