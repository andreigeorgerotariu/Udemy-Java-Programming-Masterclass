package timbuchalka.OOP.overloadingAndOverriding;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.draw();  // calls the overridden draw() method in Circle class, output: "Drawing a circle"
        Shape s2 = new Shape();
        s2.draw();
        Circle c1 = new Circle();
        c1.draw();
        c1.draw(5); // calls the overloaded draw() method in Circle class, output: "Drawing a circle with radius 5"
    }
}