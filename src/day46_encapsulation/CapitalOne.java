package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber(342546526L);
        acc.setBalance(2500.34);
        acc.setAccountHolder("Alip");
        acc.setType("360 Checking");
        System.out.println("acc = " + acc);
    }
}
