package extraPractice.objectInstance;

public class Main {

    public static void main(String[] args) {


        Main obj = new Main();
        String name = obj.getName();
    }

    public String getName(){
        return "Andrew";
    }
}