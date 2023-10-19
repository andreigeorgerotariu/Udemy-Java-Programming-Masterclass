package extraPractice.itschool.practice.session8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class UtilityClassesPractice {

    public static void main(String[] args) {
        Object object = new Object();

        LocalDate localDateNow = LocalDate.now();
        LocalDate yesterday = LocalDate.of(2023, 02, 20);

//        System.out.println(localDateNow.isAfter(yesterday));
//        System.out.println(localDateNow.isBefore(yesterday));

//        System.out.println(localDateNow.plusYears(20));
//        System.out.println(localDateNow.minusYears(10));

        LocalDateTime localDateTimeNow = LocalDateTime.now();
        LocalDate test = localDateTimeNow.toLocalDate();
//        System.out.println(localDateTimeNow);
//        System.out.println(test);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        System.out.println(localDateTimeNow.format(dateTimeFormatter));

        Date utilDate = new Date();
//        System.out.println("Util Date: " + utilDate);

        long timestampNow = 1677177435;
//        Date sqlDate = new java.sql.Date(timestamp);
//        System.out.println("SQL Date: " + sqlDate);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a number.");
        int userInput = scanner.nextInt();
        System.out.println("User input: " + userInput);

        Random random = new Random();
        int randomNumber = random.nextInt(userInput);
        System.out.println("Random number is: " + randomNumber);

        scanner.close();
    }
}