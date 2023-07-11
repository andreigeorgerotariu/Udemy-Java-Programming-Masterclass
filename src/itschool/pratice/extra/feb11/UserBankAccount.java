package itschool.pratice.extra.feb11;

public class                            UserBankAccount {

    double balance;
    String username;
    String iban;
    String bic;
    UserDetails userDetails;

    //ctrl+insert to open the menu or right click

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    @Override
    public String toString() {
        return "UserBankAccount{" +
                "balance=" + balance +
                ", username='" + username + '\'' +
                ", iban='" + iban + '\'' +
                ", bic='" + bic + '\'' +
                ", userDetails=" + userDetails +
                '}';
    }
}