package extraPractice.itschool.practice.session8;

public class JavaCoreApiPractice {

    public static void main(String[] args) {
        String animal1 = "cat   ";
        String animal2 = "CaT";
        String animal3 = "!Elephant!";

        String animal4 = "Rabbit";//garbage collector might delete this object because it has no reference pointing to him
        System.out.println(animal4);
        animal4 = "Dog";
        System.out.println(animal4);

//        System.out.println(animal1.replace("c", "b").toUpperCase().trim().substring(1, 2));//A
//        System.out.println(animal1.replace("cat", "dog").toUpperCase().trim().substring(1, 2));//O


//        System.out.println(animal1.charAt(2));
//        System.out.println(animal1.substring(0, 3));
//        System.out.println(animal1.toUpperCase());
//        System.out.println(animal1.toLowerCase());

//        System.out.println(animal1.equals(animal2));
//        System.out.println(animal1.equalsIgnoreCase(animal2));

//        System.out.println(animal1.startsWith("ca"));
//        System.out.println(animal3.contains("hAn"));

//        System.out.println(animal3.replace("!", ""));
    }
}