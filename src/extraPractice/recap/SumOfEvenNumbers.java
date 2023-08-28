package extraPractice.recap;

import java.util.Arrays;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        PrintSumOfEvenNumbers(numbers);
    }

    public static void PrintSumOfEvenNumbers(int[] numberArray) {
        int sumOfEvenNumbers = Arrays.stream(numberArray)
                .filter(value -> value % 2 == 0)
                .sum();
        System.out.println(sumOfEvenNumbers);
    }
}