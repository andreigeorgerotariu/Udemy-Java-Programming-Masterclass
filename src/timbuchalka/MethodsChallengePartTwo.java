package timbuchalka;

public class MethodsChallengePartTwo {
    public static void main(String[] args) {

        checkNumber(8);
        checkNumber(-4);
        checkNumber(0);

        double speedConvertor = toMilesPerHour(2);
        System.out.println(speedConvertor);
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    public static double toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour <= 0) {
            return -1;
        }
//        else {
//            double milesPerHour = kilometersPerHour / 1.60934;
//            milesPerHour = Math.round(milesPerHour);
//            return milesPerHour;

        return Math.round(kilometersPerHour / 1.60936);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            double milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h = " + milesPerHour + " mi/h");

        }


    }
}
