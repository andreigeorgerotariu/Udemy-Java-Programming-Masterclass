package extraPractice.recap;

public class StringLength {
    public static void main(String[] args) {

        printStringLength("Andrei");
    }

    public static void printStringLength(String str) {
        int length = str.length();
        System.out.println("Length of the string is: " + length);
    }
}
