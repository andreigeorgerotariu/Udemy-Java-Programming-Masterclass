package timbuchalka.collections;

// Write a method called reverse() with an int array as a parameter.
// The method should not return ant value. In other words, the method is allowed to modify the array parameter.
// In main() test the reverse() method and print the array both reversed and non-reversed.
// to reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
// For example, if the array is {1,2,3,4,5}, then the reversed array is {5,4,3,2,1}.

import java.util.Arrays;

public class ReverseArrayChallenge {

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