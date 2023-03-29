package timbuchalka.OOP.staticVsInstance;

public class  Dog {
    private static String name;

    public Dog(String name) {
        this.name = name;
    }


    public void printName() {
        System.out.println("name " + name);
    }
}

