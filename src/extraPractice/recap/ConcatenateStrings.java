package extraPractice.recap;

public class ConcatenateStrings {
    public static void main(String[] args) {

        concatenateStrings("Hello", "World!");
    }

    public static void concatenateStrings(String str1, String str2) {
        String result = str1 + " " + str2;
        System.out.println("Concatenated string is: " + result);
    }
}

