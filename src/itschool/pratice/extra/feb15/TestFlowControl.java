package itschool.pratice.extra.feb15;

import java.util.ArrayList;
import java.util.List;

public class TestFlowControl {

    public static void main(String[] args) {
        User user = new User();
        //all user details should have a UUID generated as ID
        //after the users were added to the userDetailsList

        UserDetails userDetails1 = new UserDetails();
        UserDetails userDetails2 = new UserDetails();
        UserDetails userDetails3 = new UserDetails();

        List<UserDetails> userDetailsList = new ArrayList<>();
        userDetailsList.add(userDetails1);
        userDetailsList.add(userDetails2);
        userDetailsList.add(userDetails3);

    }
}

class User {
    private List<UserDetails> userDetailsList;

    public List<UserDetails> getUserDetailsList() {
        return userDetailsList;
    }

    public void setUserDetailsList(List<UserDetails> userDetailsList) {
        this.userDetailsList = userDetailsList;
    }
}

class UserDetails {
    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}