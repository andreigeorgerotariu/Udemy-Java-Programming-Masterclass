package extraPractice.itschool.practice.session6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ForLoop {

    public static void main(String[] args) {
        //java collection arraylist, linkedlist, etc
        List<String> myArrayList = new ArrayList<>();
        List<String> myLinkedList = new LinkedList<>();

        int[] classicArray = {1, 2, 3};
        //                    0  1  2

        System.out.println("array length " + classicArray.length);
        System.out.println("array value from index 1: " + classicArray[1]);

        int count = 0;

        for (int index = 0; index < classicArray.length; index++) {

            for(int x : classicArray){

            }
            //code goes here
            System.out.println("array value from index " + index + " is: " + classicArray[index]);
        }

        for(int arrayValue : classicArray){
            System.out.println("Print from for-each loop: " + arrayValue);
        }

        List<String> anotherArrayList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            String listValue = "ion" + random.nextInt(1, 200) + "@gmail.com";
//            anotherArrayList.add(listValue);
//            System.out.println(listValue);
        }
    }
}