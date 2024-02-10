package timbuchalka.series;

// factorial(int n) returns the product of all numbers from 1 to n. i.e. 1*2*3*4*...*(n-1)*n.
// The first 10 factorials are: 0, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800.

public class Factorial {

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        long fact = 1;
        for (int i = 0; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}