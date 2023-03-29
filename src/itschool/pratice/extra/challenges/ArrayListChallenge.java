package itschool.pratice.extra.challenges;

//create a shopping list with Aray and print the values
//        create a whishlist for Cahristmas with Arraylist and print the values
//        create:
//        * 2 empty ArrayLists: studentList and graduateStudentList
//        * populate studentList with 10 students
//        * copy values from studentList to gradualeStudentList
//        * iterate through graduateStudentList and print each graduate student

import java.util.ArrayList;

public class ArrayListChallenge {
    public static void main(String[] args) {
        String[] shoppingList = {"eggs", "milk", "bread", "beer", "vodka"};

        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println(shoppingList[i]);
        }

        ArrayList<String> wishlist = new ArrayList<String>();

        wishlist.add("smartphone");
        wishlist.add("laptop");
        wishlist.add("camera");
        wishlist.add("headphones");
        wishlist.add("book");

        for (String item : wishlist) {
            System.out.println(item);
        }

        ArrayList<String> studentList = new ArrayList<String>();
        ArrayList<String> graduateStudentList = new ArrayList<String>();

        studentList.add("Andrew");
        studentList.add("Alex");
        studentList.add("Vlad");
        studentList.add("David");
        studentList.add("Eve");
        studentList.add("Adam");
        studentList.add("Mike");
        studentList.add("Tim");
        studentList.add("Joel");
        studentList.add("Jack");

        graduateStudentList.addAll(studentList);

        for (String student : graduateStudentList) {
            System.out.println(student);
        }


    }
}
