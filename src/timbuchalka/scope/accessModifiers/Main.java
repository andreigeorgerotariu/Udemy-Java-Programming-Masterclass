package timbuchalka.scope.accessModifiers;

public class Main {

    public static void main(String[] args) {

        Account andrewsAccount = new Account("Andrew");
        andrewsAccount.deposit(1000);
        andrewsAccount.deposit(1000);
        andrewsAccount.withdraw(1250);
        andrewsAccount.withdraw(-250);
        andrewsAccount.calculateBalance();

    }
}