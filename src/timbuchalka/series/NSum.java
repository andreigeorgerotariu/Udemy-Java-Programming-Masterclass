package timbuchalka.series;

// nSum(int n) returns the sum of all numbers from 0 to n.
// The first 10 numbers are: 0, 1, 3, 6, 10, 15, 28, 36, 45, 55.

public class NSum {

    public static long nSum(int n) {
        return (n * (n + 1)) / 2;
    }
}