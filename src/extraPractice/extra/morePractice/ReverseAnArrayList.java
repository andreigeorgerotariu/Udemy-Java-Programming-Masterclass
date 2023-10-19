package extraPractice.extra.morePractice;

import java.util.ArrayList;

public class ReverseAnArrayList {

    public static void main(String[] args) {

        ArrayListClass arrayListClass = new ArrayListClass(55);

        System.out.println(arrayListClass.getValue());

        ArrayListClass arrayListClass1 = new ArrayListClass(new ArrayList<String>());

        arrayListClass1.stringArrayList.add("Andrew");
        arrayListClass1.stringArrayList.add("Maria");
        arrayListClass1.stringArrayList.add("Alex");
        arrayListClass1.stringArrayList.add("Mike");
        arrayListClass1.stringArrayList.add("Tim");
        arrayListClass1.stringArrayList.add("John");

        reverseArrayList(arrayListClass1.stringArrayList);
    }

    public static void reverseArrayList(ArrayList<String> arrayList) {
        System.out.println("The original contents of the ArrayList is: " + arrayList);

        int maxIndex = arrayList.size() - 1;
        int halfLength = arrayList.size() / 2;

        for (int i = 0; i < halfLength; i++) {
            String temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(maxIndex - i));
            arrayList.set(maxIndex - i, temp);
        }
        System.out.println("The reversed ArrayList: " + arrayList);
    }
}