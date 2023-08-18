package timbuchalka.core;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // using "new" to create an instance of a new object of type scanner

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine(); // we're calling the method nextLine to read a line of input from the console
            int age = 2023 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " and your age is " + age);
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth. ");
        }

        scanner.close(); // "close method" for closing the scanner
        // It is recommended to close the scanner after use to free up resources
    }
}