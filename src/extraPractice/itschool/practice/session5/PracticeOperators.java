package extraPractice.itschool.practice.session5;

public class PracticeOperators {

    private double bankAccount;

    //constants are always written with caps lock
    public static String USER_CNP = "2342348929873498";

    public static void main(String[] args) {
        //short value = 343242344;
        int x = 10;
        int y = 20;
        if (x < y) {
            //code
        }

        short ab = 34;
        int a = 10;
        long b = 15;
        long c = a * b;
    }

    public void getName() {

    }
}

class Test {
    static int age = 10;

    public static void main(String[] args) {
        String test = PracticeOperators.USER_CNP;
        PracticeOperators practiceOperators = new PracticeOperators();
        practiceOperators.getName();

        if (false) {
            System.out.println("hello");
        } else if (false) {
            System.out.println("another thing");
        } else if (false) {
            //
        } else if (false) {
            //
        } else {
            //
        }

        int horsepower = 250;
        int result = horsepower < 100 ? horsepower + 10 : horsepower - 10;
        System.out.println(result); //240

        String raceResult = horsepower < 100 ? "stop race" : "start race";

        String raceResult2;
        if (horsepower < 100) {
            raceResult2 = "stop race";
        } else {
            raceResult2 = "start race";
        }
    }

    public int computeTwoNumbers(int a, int b) {
        return a + b;
    }
}

class AnotherTest {
    public static void main(String[] args) {
        Test test = new Test();
//        test = null;
        System.out.println(test.computeTwoNumbers(10, 20));

        AnotherTest anotherTest = new AnotherTest();

        String name = "alex@gmail.com";
        //ctrl+space to access object's properties
        name.trim();
        String name2 = new String("Bogdan");

        String test1 = "Lucian";

        String test2 = "Iulian";//string pool
        String test3 = "iulian";//string pool

        String test4 = new String("Iulian");

        System.out.println(test3 == test4); //false
        System.out.println(test2 == test3); //false
        System.out.println(test1 == test2); //false
        System.out.println(test1.equals(test2));//false
        System.out.println(test1.equals(test2));//false
        System.out.println(test1.equalsIgnoreCase(test2));//false
    }
}
