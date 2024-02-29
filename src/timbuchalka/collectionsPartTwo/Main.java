package timbuchalka.collectionsPartTwo;

public class Main {

    public static void main(String[] args) {

        Theater theater = new Theater("Mihai Eminescu", 8, 12);
        theater.getSeats();

        if (theater.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        if (theater.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }
}