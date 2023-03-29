package timbuchalka;

public class ForLoopSum3And5Challenge {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i; // '+=' assignment operator in Java that adds the right operand to the left operand and then assigns the result to the left operand
                System.out.println("The numbers that can be divided by both 3 and 5 are: " + i);
            }
            if (count == 5) {
                System.out.println("The sum of those numbers is: " + sum);
                break;

            }
        }
    }
}
