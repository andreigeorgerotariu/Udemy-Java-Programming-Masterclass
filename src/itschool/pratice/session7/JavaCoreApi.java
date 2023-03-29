package itschool.pratice.session7;

public class JavaCoreApi {

    public static void main(String[] args) {
        int a = (3 + 3) * 45;
        int b = 1;
        b = 2;
        String x = "1";

        //System.out.println(x + a);//13
        //System.out.println(a + b);//4

        String name = "George";

        String name1 = "Marius";
        String name2 = "Marius";
        String name3 = new String("Marius");
        System.out.println("name1 vs name2: " + (name1 == name2));//true
        System.out.println("name1 vs name3: " + (name1 == name3));//false

        //compare hashcode identity for the name1, name2 and name3 objects
        System.out.println("name1 hascode: " + Integer.toHexString(System.identityHashCode(name1)));
        System.out.println("name2 hascode: " + Integer.toHexString(System.identityHashCode(name2)));
        System.out.println("name3 hascode: " + Integer.toHexString(System.identityHashCode(name3)));
    }
}