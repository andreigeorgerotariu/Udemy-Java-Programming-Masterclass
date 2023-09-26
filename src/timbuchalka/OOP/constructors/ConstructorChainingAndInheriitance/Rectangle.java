package timbuchalka.OOP.constructors.ConstructorChainingAndInheriitance;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y) {   // 1st constructor
        this(x, y, 0, 0); // calls 2nd constructor
    }

    public Rectangle(int x, int y, int width, int height) { //2nd constructor
        super(x, y); // calls constructor from parent (Shape)
        this.width = width;
        this.height = height;
    }
}