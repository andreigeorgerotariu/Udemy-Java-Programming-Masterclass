package timbuchalka;

public class ByteShortIntLong {
    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("integer Minimum Value = " + myMinIntValue);
        System.out.println("integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
        // Example of OVERFLOW
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));
        // Example of UNDERFLOW
        int myMaxIntTest = 2_147_483_647;
        // using underscores as a way to make a number more readable
        System.out.println("Test integer Maximum Value = " + myMaxIntTest);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("byte Minimum Value = " + myMinByteValue);
        System.out.println("byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("short Minimum Value = " + myMinShortValue);
        System.out.println("short Maximum Value = " + myMaxShortValue);
        // CTRL + R = to replace

        long myLongValue = 100L; // By default, Java considers a number you type as an integer, unless you add a letter on the end
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("long Minimum Value = " + myMinLongValue);
        System.out.println("long Maximum Value = " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_123L;
        // If we don't add "L" at the final, Java still treats the number as an int (integer) and will display an error
        System.out.println(bigLongLiteralValue);

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        // Example of CASTING
        // ALT + SHIFT + ENTER = to cast (it to byte)

        Short myNewShortValue = (short) (myMinShortValue / 2);


    }
}
