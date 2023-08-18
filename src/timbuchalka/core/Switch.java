package timbuchalka.core;

public class Switch {
    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1) {
//            System.out.println(" Value was 1");
//        } else if (value == 2) {
//            System.out.println(" Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }

        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }
        char character = 'A';
        switch (character) {
            case 'A':
                System.out.println("Your character is 'A'");
                break;
            case 'B':
                System.out.println("Your character is 'B'");
                break;
            case 'C':
                System.out.println("Your character is 'C'");
                break;
            case 'D':
                System.out.println("Your character is 'D'");
                break;
            case 'E':
                System.out.println("Your character is 'E'");
                break;
            default:
                System.out.println("Unknown character");
                break;
        }
        String month = "January";
        switch (month.toLowerCase()) { //Example of a method being called using .
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure...");
        }

        int dayOfWeek = 5;

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}