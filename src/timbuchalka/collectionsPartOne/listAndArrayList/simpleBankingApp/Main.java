package timbuchalka.collectionsPartOne.listAndArrayList.simpleBankingApp;

// Create a simple banking application
// There should be a Bank Class
// It should have an ArrayList of Branches
// Each branch should have an ArrayList of Customers
// The Customer class should have an ArrayList of Doubles (transactions)
// Customer: name and the ArrayList of doubles.
// Branch: Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank: add a new branch, add a customer to that branch with initial transaction, add a transaction for an existing
// customer for that branch.
// Show a list of customers for a particular branch and optionally a list of their transactions.
// Demonstrate autoboxing and unboxing in your code.
// Hint: Transactions
// Add data validation.
// e.g. check if it exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("BNR");

        bank.addBranch("Bucharest");
        bank.addCustomer("Bucharest", "Andrew", 144.2);
        bank.addCustomer("Bucharest", "Alex", 255.5);
        bank.addCustomer("Bucharest", "Maria", 189.9);

        bank.addBranch("Cluj");
        bank.addCustomer("Cluj", "Mike", 15.23);
        bank.addCustomer("Cluj", "Tim", 222.99);
        bank.addCustomer("Cluj", "John", 189.94);

        bank.addCustomerTransaction("Bucharest", "Andrew", 22.9);
        bank.addCustomerTransaction("Bucharest", "Andrew", 122.91);
        bank.addCustomerTransaction("Bucharest", "Andrew", 221.19);

        bank.addCustomerTransaction("Bucharest", "Alex", 1500);
        bank.addCustomerTransaction("Bucharest", "Alex", 189.9);
        bank.addCustomerTransaction("Bucharest", "Alex", 144.88);

        bank.listCustomers("Bucharest", true);
        bank.listCustomers("Cluj", true);
    }
}