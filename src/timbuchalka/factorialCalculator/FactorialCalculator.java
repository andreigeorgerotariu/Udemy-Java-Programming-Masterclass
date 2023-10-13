package timbuchalka.factorialCalculator;

public class FactorialCalculator {

    public static void main(String[] args) {

        int number = 7;
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n==0) {
            return 1; // Base case: 0! is defined as 1
        } else {
            return n * calculateFactorial(n-1); // Recursive case
        }
    }
}