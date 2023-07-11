package itschool.pratice.extra.feb11;

import java.util.UUID;


public class UserDetails {

    String userId = String.valueOf(UUID.randomUUID());
    String firstName;
    String lastName;
    String email;


    public String getUserId() {
        return userId;
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