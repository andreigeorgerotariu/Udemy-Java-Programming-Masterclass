package timbuchalka.OOP.polymorphismChallenge;

public class Opel extends Car {

    public Opel(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + "-> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + "-> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + "-> brake()";
    }
}