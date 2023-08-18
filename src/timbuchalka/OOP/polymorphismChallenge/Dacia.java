package timbuchalka.OOP.polymorphismChallenge;

public class Dacia extends Car {

    public Dacia(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Dacia -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Dacia -> accelerate()";
    }

    @Override
    public String brake() {
        return "Dacia -> brake()";
    }
}