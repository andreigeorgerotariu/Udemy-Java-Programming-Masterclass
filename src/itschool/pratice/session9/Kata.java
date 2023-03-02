package itschool.pratice.session9;

public class Kata {

    public static void main(String[] args) {
        int[] testArray = {5 , 1, 1, 1, 1, 1, 1};
        //                 0  1  2  3   4  5  6
        int differentValue = testArray[0];
        int differentValueIndex = 0;
        for (int x = 1; x < testArray.length; x++) {
            if (testArray[x] != differentValue) {
                differentValue = testArray[x];
                differentValueIndex = x;

                System.out.println("The different value is: " + differentValue);
                System.out.println("The different value located at index: " + differentValueIndex);
                break;

            }
        }
    }

}