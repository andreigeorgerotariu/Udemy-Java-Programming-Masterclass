package timbuchalka.OOP.encapsulationChallenge;

public class Printer {

    private int tonerLevel = 100;
    private int totalNumberOfPrintedPages;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, int totalNumberOfPrintedPages, boolean isDuplexPrinter) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.totalNumberOfPrintedPages = totalNumberOfPrintedPages;

        if (isDuplexPrinter) {
            System.out.println("This is a duplex printer");
        }
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public int fillUpToner(int refillPercentage) {
        if (refillPercentage > 0 && refillPercentage <= 100) {
            if (this.tonerLevel + refillPercentage > 100) {
                System.out.println("the toner is full.");
                return -1;
            }
            this.tonerLevel += refillPercentage;
            System.out.println("the toner is now at " + this.tonerLevel + " percent.");
            // increase the number of pages that can be printed
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printingPages(int numberOfNewPrintedPages) {
        int pagesToPrint = numberOfNewPrintedPages;
        if (this.isDuplexPrinter){
            pagesToPrint = (numberOfNewPrintedPages / 2) + (numberOfNewPrintedPages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.totalNumberOfPrintedPages += pagesToPrint;
        System.out.println("You have printed " + pagesToPrint + " pages. The total number of printed pages so far is "
                + this.totalNumberOfPrintedPages + " pages.");
        return this.totalNumberOfPrintedPages;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getTotalNumberOfPrintedPages() {
        return totalNumberOfPrintedPages;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }
}
