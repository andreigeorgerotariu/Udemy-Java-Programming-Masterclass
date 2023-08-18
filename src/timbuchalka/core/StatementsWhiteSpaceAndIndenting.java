package timbuchalka.core;

public class StatementsWhiteSpaceAndIndenting {
    public static void main(String[] args) {

        int myVariable = 50; // statement - is the entire line ('int myVariable = 50;') / expression is 'myVariable = 50'
        myVariable++; // usually ';' marks the end of the statement
        myVariable--;
        System.out.println((myVariable++) + " " + (myVariable--)); // White Space - is the space between operators and variable names , etc
    }
}