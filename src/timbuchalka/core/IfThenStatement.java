package timbuchalka.core;

public class IfThenStatement {
    public static void main(String[] args) {

        boolean isAlien = false; // "=" is an assignment operator. It assigns the value of an expression ("false" in this case) to the variable on the left (isAlien)
        if (isAlien == false) // "==" is testing to see if the particular value is false/ "==" it asks if the operands are identical or equal to each other
            System.out.println("It is not an alien!");
        // no ";" after the if statement. if we put ";", it ends the line and the next line will be executed no matter if content of the parenthesis si true or false

        boolean isHuman = false;
        if (isHuman == false) { // "{" is a CODE BLOCK. ALWAYS USE A CODE BLOCK in IF-THEN EXPRESSIONS!
            System.out.println("It is not an human!");
            System.out.println("And I'm afraid!");
        }
        int topScore = 80;
        if (topScore != 100) {   // "!=" Not equal operator
            System.out.println("You got the highest score!");
        }

        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100) { //&& two ampersands put together is a logical AND operator that represents "AND" operation
            System.out.println("Greater than second top score and less than 100");
        }
    }
}