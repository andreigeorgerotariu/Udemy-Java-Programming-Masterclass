package extraPractice;

public class StatementControls {

    public static final String MONDAY = "monday";
    public static final String THURSDAY = "thursday";
    public static final String WEDNESDAY = "wednesday";

    public static void main(String[] args) {
        // Mon, Thu, Whe
        checkIfOpen("moNday");
        checkIfOpenSwitch("Sunday");
    }

    public static void checkIfOpen(String dayOfTheWeek) {
        if (dayOfTheWeek.equalsIgnoreCase(MONDAY)
                || dayOfTheWeek.equalsIgnoreCase(THURSDAY)
                || dayOfTheWeek.equalsIgnoreCase(WEDNESDAY)) {
            System.out.println("Today is open!");
        } else {
            System.out.println("Today is closed!");
        }
    }

    public static void checkIfOpenSwitch(String dayOfTheWeek) {
        switch (dayOfTheWeek.toLowerCase()) {
            case MONDAY -> System.out.println("Today is open!");
            case THURSDAY -> System.out.println("Today is open!");
            case WEDNESDAY -> System.out.println("Today is open!");
            default -> System.out.println("Today is closed!");
        }
    }
}
