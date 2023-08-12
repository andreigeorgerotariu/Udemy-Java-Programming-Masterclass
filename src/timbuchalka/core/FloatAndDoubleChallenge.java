package timbuchalka.core;

public class FloatAndDoubleChallenge {

    public static void main(String[] args) {

        double pounds = 5.2d;
        double kilos = 15d;
        double poundsToKilos = 0.45359237 * (pounds);
        double kiloToPounds = 2.204622621848776 * (kilos);
        System.out.println(pounds + " pounds converted to kilos = " + poundsToKilos);
        System.out.println(kilos + " kilos converted to pounds = " + kiloToPounds);
    }
}
