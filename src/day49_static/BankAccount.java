package day49_static;

public class BankAccount {
    static double balance = 500000000;
    String user;

    public void spend(double amount) {
        System.out.println(user + " is spending $" + amount);
        balance -= amount;
    }
    public void showBalance() {
        System.out.println("Current balance = " + balance);
    }
}
