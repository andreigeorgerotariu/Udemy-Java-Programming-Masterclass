package extraPractice.recap;

public class PrintLettersExceptFirstOne {
    public static void main(String[] args) {

        printEveryOtherCharExceptFirst("Andrei");
    }

    public static void printEveryOtherCharExceptFirst(String str) {
        for (int index = 1; index < str.length(); index ++) {
            System.out.print(str.charAt(index));
        }
    }
}