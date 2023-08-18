package timbuchalka.OOP.polymorphismChallenge;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Dacia dacia = new Dacia(4, "Logan");
        System.out.println(dacia.startEngine());
        System.out.println(dacia.accelerate());
        System.out.println(dacia.brake());

        Ford ford = new Ford(6, "Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Opel opel = new Opel(6, "Astra");
        System.out.println(opel.startEngine());
        System.out.println(opel.accelerate());
        System.out.println(opel.brake());
    }
}