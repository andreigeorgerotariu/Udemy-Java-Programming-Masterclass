package itschool.pratice.extra.feb11;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class BankAccountService {

    public static void main(String[] args) {

        UserDetails userDetails = new UserDetails();
        userDetails.setFirstName("Ion");
        userDetails.setLastName("Popescu");
        userDetails.setEmail("popescu@gmail.com");

        UserBankAccount userBankAccount = new UserBankAccount();
        userBankAccount.setUsername("ionpop");
        userBankAccount.setBic("FD34");
        userBankAccount.setBalance(234999.45);
        userBankAccount.setIban("INGFDKF34234MN233H4");
        userBankAccount.setUserDetails(userDetails);
        System.out.println("Initial balance: " + userBankAccount.getBalance());

        double balance = userBankAccount.getBalance();
        double amountSpent = 243.5;
        double overflowAmount = 334999.45;

        BankAccountService bankAccountService = new BankAccountService();
        double valueAfterAtmWithdraw = bankAccountService.atmWithdrawMoney(balance, amountSpent);
        userBankAccount.setBalance(valueAfterAtmWithdraw);
        System.out.println("Updated balance after ATM withdraw: " + userBankAccount.getBalance());

        String currentDay = "Monday";
        double valueAfterBankWithdraw = bankAccountService.bankWithdrawMoney(currentDay, valueAfterAtmWithdraw, 4545.453);
        userBankAccount.setBalance(valueAfterBankWithdraw);
        System.out.println("Updated balance after Bank withdraw: " + userBankAccount.getBalance());
    }

    public double atmWithdrawMoney(double balance, double amountWithdraw) {
        if (amountWithdraw > balance) {
            System.out.println("You don't have enough money.");
            return balance;
        }

        return balance - amountWithdraw;
    }

    public double bankWithdrawMoney(String currentDay, double balance, double amountWithdraw) {
        List<String> workingDays = new ArrayList<>();
        workingDays.add("Monday");
        workingDays.add("Tuesday");
        workingDays.add("Wednesday");
        workingDays.add("Thursday");
        workingDays.add("Friday");

        if (!workingDays.contains(currentDay)) {
            System.out.println("Please come back from Monday to Friday, from 8 to 16.");
            return balance;
        }

        LocalTime currentTime = LocalTime.now();
        LocalTime morningTime = LocalTime.of(8, 0);
        LocalTime afternoonTime = LocalTime.of(16, 0);
        if (currentTime.isBefore(morningTime) || currentTime.isAfter(afternoonTime)) {
            System.out.println("Please come back from Monday to Friday, from 8 to 16.");
            return balance;
        }

        return balance - amountWithdraw;
    }
}