package extraPractice.itschool.practice.session14;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 12, 55, 67, 88};
        reverse(array);
    }

    public static void reverse(int[] array) {
        System.out.println("The original array is: " + Arrays.toString(array));

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }

        System.out.println("The modified array is: " + Arrays.toString(array));
    }
}