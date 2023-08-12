package timbuchalka.core;

public class FloatAndDouble {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Min float Value is: " + myMinFloatValue);
        System.out.println("Max float Value is: " + myMaxFloatValue);
        System.out.println("Min double Value is: " + myMinDoubleValue);
        System.out.println("Max double Value is: " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = (float) 5.25; // Casting of float. by default Java will treat the number as a double
        float myBisFloatValue = 5.25f; // preferred format for expressing a float number
        double myDoubleValue = 5.25d; //double is the default value for floating points numbers

        int intValue = 5 / 3;
        float floatValue = 5f / 3f;
        double doubleValue = 5d / 3d;
        System.out.println("int value= " + intValue);
        System.out.println("float value= " + floatValue);
        System.out.println("double value= " + doubleValue);

         double anotherNumber = 3_000_000.44_158; // underscores can be used for easier reading of a number
        System.out.println(anotherNumber);

    }
}
