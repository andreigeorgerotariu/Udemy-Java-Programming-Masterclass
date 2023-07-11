package recap;

public class PrintFirstAndLastChars {
    public static void main(String[] args) {

        printFirstAndLastChars("Andrei");
    }

    public static void printFirstAndLastChars(String value) {
        char firstLetter = value.charAt(0);
        char lastLetter = value.charAt(value.length() - 1);
        System.out.println("First character is: " + firstLetter);
        System.out.println("Last character is: " + lastLetter);
    }

}

