package timbuchalka.OOP.encapsulationChallenge;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50,120,true);

        printer.fillUpToner(50);
        int pagesPrinted = printer.printingPages(4);
        pagesPrinted = printer.printingPages(2);
        pagesPrinted = printer.printingPages(133);
    }
}