package timbuchalka.core;

public class WhileDigitSumChallenge {
    public static void main(String[] args) {

        System.out.println("The sum of digits is " + sumDigits(125));
        System.out.println("The sum of digits is " + sumDigits(1999999999));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        // 125 -> 152/10 = 12 -> 12*10 = 120 -> 125-120 = 5
        while (number >0) {
            // extract the least-significant digit
            int digit = number % 10;
            sum += digit; // ads digit to the sum

            // drop the least significant digit
            number /= 10; // equivalent to number = number / 10;
        } return sum;
    }

//    public static int sumDigits(int number) {
//        if (number < 10) {
//            return -1;
//        }
//        int sum = 0;
//        while (number >0) {
//            int digit = number % 10;
//            sum += digit;
//            number /= 10;
//        } return sum;
//    }
}
