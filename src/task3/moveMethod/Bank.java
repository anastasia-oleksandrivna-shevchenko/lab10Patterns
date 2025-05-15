package task3.moveMethod;

import java.util.List;

public class Bank {
    private final List<Account> accounts;

    public Bank(List<Account> accounts) {
        this.accounts = accounts;
    }
    // Конструктор та інші методи класу...

    public void processAccounts() {
        for (Account account : accounts) {
            calculateInterest(account);
        }
    }
    public void calculateInterest(Account account) {
        double interest = account.getBalance() * account.getInterestRate() / 100;
        System.out.println("Interest calculated: " + interest);
    }
}
