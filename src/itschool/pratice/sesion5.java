package itschool.pratice;

public class sesion5 {
    int[] testArray = {1, 2, 5, 9, 15, 4, 3};
    public static void main(String[] args) {
        int[] testArray = {1, 2, 5, 9, 15, 4, 3};
        //                 0  1  2  3   4  5  6
        int maxValue = testArray[0];
        int maxValueIndex = 0;
        for (int x = 1; x < testArray.length; x++) {
            if (testArray[x] > maxValue) {
                maxValue = testArray[x];
                maxValueIndex = x;
            }
        }
        System.out.println("The maximum value is: " + maxValue);
        System.out.println("The maximum value is located at index: " + maxValueIndex);
    }

}
