package timbuchalka.collections.listAndArrayList.mobilePhoneContactsApp;

// Create a program that implements a  simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create separate class for Contacts (name and phone number).
// Create a master class (mobilePhone) that holds the ArrayList of Contacts.
// The MobilePhone Class has the functionality listed above.
// Add a menu of options that are available.
// Options: Quit, print list of contacts, add a new contact, update existing contact, remove contact and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone.
// e.g. no ints, no .get(i) etc.
// MobilePhone should do everything with Contact objects only.

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0742 548 179");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\n Enter action: (press 6 to show available actions");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\n Shutting down...");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String newContactName = scanner.nextLine();
        System.out.println("Enter the phone number of the new contact: ");
        String newPhoneNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newContactName, newPhoneNumber);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + newContactName + ", phone = " + newPhoneNumber);
        } else {
            System.out.println("Cannot add, " + newContactName + " already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String existingContactName = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(existingContactName);
        if (existingContactRecord == null) {
            System.out.println("Contact not found!");
            return;
        }
        System.out.print("Enter new contact name: ");
        String newContactName = scanner.nextLine();
        System.out.println("Enter a phone number for the new contact: ");
        String newPhoneNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newContactName, newPhoneNumber);
        if (mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successful updated record!");
        } else {
            System.out.println("Error updating record!");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String existingContactName = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(existingContactName);
        if (existingContactRecord == null) {
            System.out.println("Contact not found!");
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Contact successfully removed!");
        } else {
            System.out.println("Error in removing the contact!");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String existingContactName = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(existingContactName);
        if (existingContactRecord == null) {
            System.out.println("Contact not found!");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
    }

    private static void startPhone() {
        System.out.println("Starting phone... ");
    }

    private static void printActions() {
        System.out.println("\n Available actions: \n press");
        System.out.println("0 - to shutdown \n" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - query if an existing contact exists\n" +
                "6 - to print a list of available actions. ");
        System.out.println("Choose a action: ");
    }
}