package timbuchalka.interfacesVsAbstractClasses.abstractClasses;

public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println(getName() + " is not very good at flying, but could swim instead...");
    }
}