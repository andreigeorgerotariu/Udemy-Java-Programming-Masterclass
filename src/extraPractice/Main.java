package extraPractice;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");

        String fruit1 = stringList.get(0); // No casting needed
        String fruit2 = stringList.get(1);
        System.out.println(fruit1 + " " + fruit2);
    }
}