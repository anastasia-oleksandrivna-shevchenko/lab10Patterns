package task6.separateQueryFromModifier;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void addCommission(){
        double COMMISSION_RATE = 0.05;
        balance -= balance * COMMISSION_RATE;
    }
}
