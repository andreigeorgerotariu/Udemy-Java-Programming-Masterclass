package timbuchalka.OOP.composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("22B", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1140)); // 'new Resolution' created an instance of a class without using a variable

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 5, "v2.44");

        PC thePC = new PC(theCase, monitor, motherboard); // we've created the PC class by passing those three other objects to it

        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();
    }
}