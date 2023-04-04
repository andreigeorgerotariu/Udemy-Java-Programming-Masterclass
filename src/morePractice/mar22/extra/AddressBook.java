package morePractice.mar22.extra;

import java.util.ArrayList;

public class AddressBook {
    private ArrayList<Contact> contacts;

    public AddressBook(ArrayList<Contact> contacts){
        this.contacts = contacts;
    }

    public AddressBook() {

    }

//    public AddressBook(ArrayList<Contact> contacts) {
//        this.contacts = contacts;
//    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        this.contacts.remove(contact);
    }

    public ArrayList<Contact> getAllContacts() {
        return this.contacts;
    }

    public ArrayList<Contact> search(String searchString){
        ArrayList<Contact> results = new ArrayList<Contact>();

        for (Contact contact : this.contacts){
            if (contact.getName().contains(searchString) ||
                contact.getPhoneNumber().contains(searchString) ||
                contact.getPhoneNumber().contains(searchString) ||
                contact.getEmail().contains(searchString)) {
                results.add(contact);
            }
        } return results;
    }
}
