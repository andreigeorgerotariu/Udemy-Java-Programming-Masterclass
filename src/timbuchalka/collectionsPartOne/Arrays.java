package timbuchalka.collectionsPartOne;

public class Arrays {

    public static void main(String[] args) {

        //Ways to initialize Arrays:

        int[] myIntArray = new int[10]; //Creating an array that has 10 elements
        myIntArray[5] = 50; // assigning the value '50' into the element 6 of the array (because the array start from 0)
        System.out.println(myIntArray[5]);

        int[] myOtherArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(myOtherArray[0]);

        int[] myAnotherArray = new int[5];
        for (int i = 0; i < myAnotherArray.length; i++) {
            myAnotherArray[i] = i * 10;
        }
        printArray(myAnotherArray);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}