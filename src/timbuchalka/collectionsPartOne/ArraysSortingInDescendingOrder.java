package timbuchalka.collectionsPartOne;


//Create a program using arrays that sorts a list of integers in descending order
//Set up the program so that the numbers to sort are read in from the keyboard.
//Implement the following methods - getIntegers, printArray, and sortIntegers.
//getIntegers returns an array of entered integers from keyboard.
//printArray prints out the contents of the array
//sortIntegers should sort the array and return a new array contain the sorted numbers.
//you will have to figure out how to copy the array elements from the passed array into a new
//array and sort them and return the new sorted array.

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSortingInDescendingOrder {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int capacity) {
        System.out.println("Enter " + capacity + " integer values.\r");
        int[] array = new int[capacity];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " of the array is: " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}