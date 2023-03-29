package timbuchalka.OOP.classes;

public class Main {

    public static void main(String[] args){
        Car porsche = new Car(); // we created a new object called 'porsche' which is of type car
        // in other words we created an object called 'porsche' based on the template 'car'
        Car dacia = new Car();

        porsche.setModel("Carrera"); // calling the 'setModel' method for our object and updating it with the value 'Carrera'
        System.out.println("Model is " + porsche.getModel());
    }
}
