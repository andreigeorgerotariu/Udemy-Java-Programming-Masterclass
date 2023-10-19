package extraPractice.extra.morePractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        String[] strArray = new String[10];
        int[] intArray = new int[10];

        strArray[0] = "Andrew";
        strArray[1] = "Maria";
        strArray[3] = "Alex";

        printArray(strArray);

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Andrew");

        System.out.println(stringArrayList);
        System.out.println(Arrays.toString(strArray));
    }

    public static void printArray(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i] != null) {
                System.out.println(stringArray[i]);
            }
        }
    }
}