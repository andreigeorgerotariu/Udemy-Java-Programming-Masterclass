package timbuchalka.collections;

import java.util.Scanner;

public class resizeArray {

    private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[5];

    public static void main(String[] args) {

        System.out.println("Enter 5 integers: ");
        getInput();;
        printArray(baseData);
        resizeArray();

        baseData[5] = 15;
        baseData[6] = 20;
        printArray(baseData);
    }

    private static void getInput() {
        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = s.nextInt();
        }
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i ++){
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    private static void resizeArray(){
        int[] original = baseData;

        baseData = new int[7];
        for(int i = 0; i<original.length; i++){
            baseData[i] = original[i];
        }
    }
}