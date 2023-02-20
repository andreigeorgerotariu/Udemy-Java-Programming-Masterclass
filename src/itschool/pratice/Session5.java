package itschool.pratice;

public class Session5 {
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
        String name = "Ion " + "Maria";

        Session5 session5 = new Session5();
//        System.out.println("The maximum value is: " + maxValue + session5);
//        System.out.println("The maximum value is located at index: " + maxValueIndex);
//        System.out.println("Test " + name);
        // CTRL + /
        // sout = System.out.println
        // psvm = public... main method
        // CTRL + ALT + L autoformat
        // CTRL + ALT + O erase unused import
        // CTRL + D = Duplicate codeline
        // CTRL + Y = Delete codeline
        // CTRL + SPACE = Shows propreties of the object ( name. CTRL + SPACE => equals method )

        User alex = new User();
        User andrei = new User();
        andrei.testMethod();
        int value = 10;

        System.out.println(alex.getName());
        alex.setName("Alex");
        System.out.println(alex.getName());

    }


}

