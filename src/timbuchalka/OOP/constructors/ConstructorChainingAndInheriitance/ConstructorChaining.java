package timbuchalka.OOP.constructors.ConstructorChainingAndInheriitance;

public class ConstructorChaining {

    private int x;
    private int y;
    private int width;
    private int height;

    public ConstructorChaining() {  // 1st constructor
        this(0, 0);  // calls 2nd constructor
    }

    public ConstructorChaining(int width, int height) {  // 2nd constructor
        this(0, 0, width, height); // calls 3rd constructor
    }

    public ConstructorChaining(int x, int y, int width, int height) {   // 3rd constructor
        // initialize variables
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
