package timbuchalka.series;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(NSum.nSum(i));
        }
        System.out.println("**********");

        for (int i = 0; i <= 10; i++) {
            System.out.println(Factorial.factorial(i));
        }
        System.out.println("**********");

        for (int i = 0; i <= 10; i++) {
            System.out.println(Fibonacci.fibonacci(i));
        }
        System.out.println("**********");
    }
}