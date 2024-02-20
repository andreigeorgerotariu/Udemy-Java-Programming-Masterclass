package timbuchalka.collectionsPartOne.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class OrderingCitiesAlphabeticallyWithListIterator {

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Rome");
        placesToVisit.add("Budapest");
        placesToVisit.add("Ljubljana");
        placesToVisit.add("Venice");
        placesToVisit.add("Turin");
        placesToVisit.add("Naples");

        printList(placesToVisit);

        placesToVisit.add(1, "Bucharest");
        placesToVisit.remove(4);
        printList(placesToVisit);


        addInOrder(placesToVisit, "Ankara");
        addInOrder(placesToVisit, "Zagreb");
        addInOrder(placesToVisit, "Vienna");
        addInOrder(placesToVisit, "Sofia");
        addInOrder(placesToVisit, "Bratislava");
        addInOrder(placesToVisit, "Berlin");
        addInOrder(placesToVisit, "Podgorica");
        addInOrder(placesToVisit, "Sarajevo");
        printList(placesToVisit);

        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                //newCity should appear before this one
                //Bucharest -> Ankara
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                //move on to next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in the itinerary ");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;

                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting: " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            goingForward = false;
                        }
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at hte start of the list");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available options: \npress");
        System.out.println("o - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print many options");
    }
}