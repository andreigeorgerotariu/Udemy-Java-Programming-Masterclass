package timbuchalka.core;

public class PrimitiveTypeChallenge {

    public static void main(String[] args) {

        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        byte byteNumber = 12;
        short shortNumber = 12481;
        int intNumber = 144144;
        long longNumber = 50000L + 10L * (byteNumber + shortNumber + intNumber);
        System.out.println("The long number is: " + longNumber);
    }
}
