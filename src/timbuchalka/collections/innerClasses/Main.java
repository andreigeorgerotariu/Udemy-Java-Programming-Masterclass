package timbuchalka.collections.innerClasses;

public class Main {

    public static void main(String[] args) {

        GearBox mcLaren = new GearBox(6);
        GearBox.Gear first = mcLaren.new Gear(1, 12.3); // Correct way to initialize an inner class
        System.out.println(first.driveSpeed(1000));

    }
}