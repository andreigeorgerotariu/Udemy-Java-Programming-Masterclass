package timbuchalka.collections.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

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
}