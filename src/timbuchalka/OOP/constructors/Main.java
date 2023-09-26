package timbuchalka.OOP.constructors;

public class Main {
    public static void main(String[] args) {

        BankAccount andrewsAccount = new BankAccount("1114", 1234.00, "Andrew", "andrew@gmail.com", 124855);
        // 'new BankAccount()' - is calling the constructor

        System.out.println(andrewsAccount.getNumber());
        System.out.println(andrewsAccount.getBalance());

        andrewsAccount.withdraw(100);
        andrewsAccount.deposit(50);
        andrewsAccount.withdraw(100);
        andrewsAccount.deposit(55);
        andrewsAccount.withdraw(100);

        BankAccount alexsAccount = new BankAccount("Alex", "alex@gmail.com", 1236988);
        System.out.println(alexsAccount.getNumber() + " name " + alexsAccount.getCustomerName());

        VipCustomer person1 = new VipCustomer();
        person1.getName();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Maria", 2500);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("David", 69, "david@mail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());

    }
}