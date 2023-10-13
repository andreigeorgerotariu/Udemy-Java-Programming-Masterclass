package timbuchalka.collections.linkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Andrew", 109.98);
        Customer anotherCustomer;
        anotherCustomer = customer; // Java points to the memory address of the first class instance
        anotherCustomer.setBalance(12.18);

        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());


        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + " : " + intList.get(i));
        }

        intList.add(1, 22); // The other elements move down

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + " : " + intList.get(i));
        }
    }
}