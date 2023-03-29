package timbuchalka;

public class MethodsChallengePartTwoMain {
    public static void main(String[] args) {

        double miles = MethodsChallengePartTwo.toMilesPerHour(10.5);
        // to call the method from  other classes, we need to specify the class name, press dot key'.' and then the method name
        System.out.println("Miles = " + miles);

        MethodsChallengePartTwo.printConversion(10.5);
    }
}
