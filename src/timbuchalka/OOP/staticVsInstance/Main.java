package timbuchalka.OOP.staticVsInstance;

public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("Rex"); // create instance (rex)
        Dog fluffy = new Dog("Fluffy"); // creates instance (Fluffy)
        rex.printName(); // PRINTS FLUFFY!
        fluffy.printName(); // prints fluffy
    }
}
