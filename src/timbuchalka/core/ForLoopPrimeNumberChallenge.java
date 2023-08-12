package timbuchalka.core;

public class ForLoopPrimeNumberChallenge {
    public static void main(String[] args) {
        System.out.println("test");
        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {

                count++;

                System.out.println("The number " + i + " is a prime number");
            }
            if (count == 10) {

                System.out.println(" Exiting the loop");
                break;
            }
        }
    }


    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
//            System.out.println("Looping...");
            if (n % i == 0) {
            }
            return false;
        }
        return true;
    }
}
