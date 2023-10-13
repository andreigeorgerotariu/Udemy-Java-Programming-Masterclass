package timbuchalka.collections.listAndArrayList.autoboxingAndUnboxing;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Andrew");

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = 55; // at compile time -> Integer.valueOf(55);
        Double doubleValue = 15.25;

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i)); //Autoboxing
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " ---> " + intArrayList.get(i).intValue()); // Unboxing
        }

        // Unboxing
        Integer myIntValue = 56; // at compile time -> Integer.valueOf(56);

        //Autoboxing
        int myInt = myIntValue; // at compile time myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl)); //Autoboxing
        }
        for (int i = 0; i < myDoubleValues.size(); i++) {
            System.out.println(i + " --->" + myDoubleValues.get(i).doubleValue()); // Unboxing
        }
    }
}