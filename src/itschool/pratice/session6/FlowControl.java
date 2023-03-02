package itschool.pratice.session6;

public class FlowControl {


    public static void main(String[] args) {
        String name1 = "Andreea";
        String name2 = "Andreea";

        User use1 = new User();
        User use2 = new User();

        use1.setName("Maria");
        use2.setName("Ion");

        System.out.println(name1 == name1);
        System.out.println(name1.equals(name2));
    }
}

class User {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}