package extraPractice.itschool.practice.recap;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        User user1 = new User();
        user1.setFirstName("Andrei");
        user1.setLastName("Popescu");

        User user2 = new User();
        user1.setFirstName("Maria");
        user1.setLastName("Pop");

        userList.add(user1);
        userList.add(user2);

        for (User user : userList) {
            System.out.println(user.getFirstName());
        }

        // userList = { user1, user2 }
        //                0       1
        for (int index = 0; index < userList.size(); index++) {
            System.out.println(userList.get(index).getFirstName());
        }
    }

}

class User {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}