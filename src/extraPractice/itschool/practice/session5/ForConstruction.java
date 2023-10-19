package extraPractice.itschool.practice.session5;

public class ForConstruction {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4};
                     //  0  1  2  3  4
        String[] stringArray = {"dog", "cat", "horse"};
//        print number of integers
//        System.out.println(myArray.length);

//        System.out.println("Print int from index 1: " + myArray[1]);
//        System.out.println("Print int from index 1: " + stringArray[1]);

        for (int index = 3; index <= myArray.length; index++) {
            //System.out.println(myArray[index]);
        }
//        for (int value : myArray) {
//            System.out.println(value);
//        }

//      find pairs of numbers with sum = 10
//      Big O notation = time and space complexity Ologn
        int[] testArray = {1, 2, 3, 8, 4, 7};
        for (int index = 0; index < testArray.length; index++) {
            for (int y = 0; y < testArray.length; y++) {
                if (testArray[index] + testArray[y] == 10) {
                    System.out.println(testArray[index] + " " + testArray[y]);
                }
            }
        }

        //find where the max value from the array is
        // array = [1, 5, 3, 9, 8, 15, 4, 3]

        //practice
        //https://www.codewars.com/
        //https://codeforces.com/problemset/problem/71/A
    }
}