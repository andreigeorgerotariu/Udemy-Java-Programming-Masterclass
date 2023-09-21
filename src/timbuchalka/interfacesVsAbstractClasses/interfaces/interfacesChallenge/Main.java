package timbuchalka.interfacesVsAbstractClasses.interfaces.interfacesChallenge;

//Create a simple interface(tip: name it Saveable or ISaveable)
//That interface allows an object to be saved to some sort of storage medium. (tip: use ArrayList)
//The exact type of medium is not known to the interface (nor to the classes that implement it)
//The interface will just specify two methods, one to return an ArrayList of values to be saved
//and other to populate the object's fields from the ArrayList(parameter).
//Create a few sample classes that implement Saveable interface (we've used the ideea of a game with
//Players and Monsters, but you can create any type of classes that you want).
//Override the toString() method for each of your classes so that they can be easily printed to enable the program
//to be tested easier.
//In Main, write a method that takes an object that implements the interface as a parameter and "saves" the values e.g.
// calls the method defined in the interface.
//We haven't covered I/O yet, so your method should just print the values to the screed.
//Also in the Main class, write a method that restores the values to a Saveable object e.g. calls the method from the
//interface for populating fields (sea above).
//Again, we are not going to use Java file I/O; instead use the readValues() method below to simulate getting values
// from a file - this allows you to type as many values as your class requires, and returns an ArrayList.
//There is a whole Java I/O section later in the course where you will get to use files, etc.

public class Main {

    public static void main(String[] args) {

    }
}