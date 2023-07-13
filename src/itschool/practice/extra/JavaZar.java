package itschool.practice.extra;

public class JavaZar {

    public static void main(String[] args) {
        double totalPrice = calculateTotalPrice(0.5, 1);
        System.out.println("Total price is " + totalPrice );
    }

        public static double calculateTotalPrice (double kgBananas, double kgApples) {
            double bananaPricePerKg = 5.0;
            double applePricePerKg = 4.0;
            int bananaStock = 20;
            int appleStock = 10;

            double bananaPrice = bananaPricePerKg * kgBananas;
            double applePrice = applePricePerKg * kgApples;

            return bananaPrice + applePrice;

        }

    }


