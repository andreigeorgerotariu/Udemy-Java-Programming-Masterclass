package timbuchalka.collectionsPartOne;

// Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
// The method needs to read from the console until all the numbers are entered, and then return an array contain the numbers entered.
// Write a method findMin() with the array as a parameter. the method needs to return the minimum value in the array.
// In the main() method read the count from the  console and call the method readIntegers() with the count parameter.
// Then call the findMin() method passing the array returned from the call to the readIntegers() method.
// Finally, print the minimum element in the array.
// Tips: Assume that the user will only enter numbers, never letters.
// For simplicity, create a Scanner as a static field to help with data input.

import java.util.Scanner;

public class MinElementChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("min = " + returnedMin);
    }

    private static int[] readIntegers(int count) {

        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}