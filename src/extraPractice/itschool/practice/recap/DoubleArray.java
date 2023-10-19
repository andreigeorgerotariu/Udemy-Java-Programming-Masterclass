package extraPractice.itschool.practice.recap;

import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {
        double[]myArray = {1.2, 1.45, 2.56, 4.5};
        squareElements(myArray);
    }


    public static void squareElements(double[] numbers) {
        Arrays.stream(numbers)
                .map(num -> num * num)
                .forEach(num -> System.out.println(num));
    }
}