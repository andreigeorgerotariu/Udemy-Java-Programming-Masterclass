package timbuchalka.OOP.constructors;

public class VipCustomer {
    String name;
    int creditLimit;
    String emailAddress;


    public VipCustomer() {
        this("Default name", 000000, "noemail@mail.com");
        System.out.println("First Constructor");

    }

    public VipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "unknown");
        System.out.println("Second constructor");

    }

    public VipCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("Last constructor");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
