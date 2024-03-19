package timbuchalka.collectionsPartTwo;

public class SplitMethod {

    public static void main(String[] args) {

        String[] road = "You are standing at the end of the road before a small brick building".split(" ");
        for (String i : road) {
            System.out.println(i);
        }

        System.out.println("===========================================================================");

        String[] road1 = "You are standing at the end of the road before a small brick building".split("s");
        for (String i : road1) {
            System.out.println(i);
        }

        System.out.println("===========================================================================");

        String[] building = "You are inside a building, a well house for a small spring".split(", ");
        for (String i : building) {
            System.out.println(i);
        }

        System.out.println("===========================================================================");

        String[] building1 = "You are inside a building, a well house for a small spring".split(" ", 5);
        for (String i : building1) {
            System.out.println(i);
        }
    }
}