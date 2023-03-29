package timbuchalka.OOP.InheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        Dacia dacia = new Dacia(36);
        dacia.steer(45);
        dacia.accelerate(30);
        dacia.accelerate(20);
        dacia.accelerate(-42);
    }
}
