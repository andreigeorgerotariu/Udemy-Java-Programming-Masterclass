package timbuchalka.core;

public class Strings {
    public static void main(String[] args) {

    String myString = "This is a String";
        System.out.println( "myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println( "myString is equal to " + myString);
        myString = myString + "\u00A9 2023";
        System.out.println( "myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + " 49.95";
        System.out.println(numberString);
        // String is dealing with textual data only, and it doesn't treat the numeric numbers that we've keyed there as numbers but as the textual representation

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 12.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString and double number is equal to " +lastString);
    }
}