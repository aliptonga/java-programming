package day49_static;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount alip = new BankAccount();
        alip.user = "dad";
        alip.showBalance();
        alip.spend(100.0);
        alip.showBalance();

        BankAccount wife = new BankAccount();
        wife.user = "wife";
        wife.showBalance();
        wife.spend(100000000);
        wife.showBalance();
    }
}
