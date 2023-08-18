package timbuchalka.core;

public class ParsingValuesFromString {
    public static void main(String[] args){
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);
        int number = Integer.parseInt(numberAsString);  // Integer is a wrapper class for the primitive type int
        // static method '.parseInt' converts the string data type to int data type
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;
        System.out.println(numberAsString + " vs " + number);
    }
}