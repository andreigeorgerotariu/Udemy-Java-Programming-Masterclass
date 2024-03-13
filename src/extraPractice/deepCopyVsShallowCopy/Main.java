package extraPractice.deepCopyVsShallowCopy;

public class Main {

    public static void main(String[] args) {

        Address address = new Address("Bucharest");
        Person originalPerson = new Person("Andrew", address);

        //Shallow copy
        Person shallowPerson = new Person(originalPerson.getName(), originalPerson.getAddress());

        //Deep copy

        Address deepCopiedAddress  = new Address(originalPerson.getAddress().getCity());
        Person deepCopyPerson = new Person(originalPerson.getName(), deepCopiedAddress);

        //Modify originalPerson's address
        address.setCity("Budapest");

        System.out.println("Original Person:");
        System.out.println(originalPerson.getName() + " lives in " + originalPerson.getAddress());
        System.out.println("Shallow Person:");
        System.out.println(shallowPerson.getName() + " lives in " + shallowPerson.getAddress());
        System.out.println("Deep Copy Person:");
        System.out.println(deepCopyPerson.getName() + " lives in " + deepCopyPerson.getAddress());


    }
}