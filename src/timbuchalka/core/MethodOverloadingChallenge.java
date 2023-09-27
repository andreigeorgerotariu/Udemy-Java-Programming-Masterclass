package timbuchalka.core;

public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        // 1 inch = 2.54cm
        // 1 foot = 12 inches
        double convertedCm = 0;
        double firstConversion = calcFeetAndInchesToCentimeters(5, 5);

        calcFeetAndInchesToCentimeters(157);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inch) {
        double convertedCm;
        if (feet < 0 || (inch < 0) || (inch > 12)) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        } else {
            convertedCm = (feet * 12 + inch) * 2.54;
        }
        System.out.println(feet + " feet and " + inch + " inches equals " + convertedCm + " centimeters!");
        return convertedCm;
    }

    public static double calcFeetAndInchesToCentimeters(double inch) {
        double convertedCm;
        if (inch <= 0) {
            return -1;
        }
        double feet = (int) inch / 12;
        double remainingInches = (int) inch % 12;
        System.out.println(inch + " inches is equal to " + feet + " feet and " + remainingInches + " remaining inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}