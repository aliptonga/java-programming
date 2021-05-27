package day09_scanner_practice;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

    System.out.println("Enter hourly rate: ");
    double hourlyRate=35;
    double weeklyPay=hourlyRate*40;
    double monthlyPay=weeklyPay*52/12;
    double annualPay=monthlyPay*12;

    System.out.println("Weekly pay : "+weeklyPay);
    System.out.println("Monthely pay : "+monthlyPay);
    System.out.println("Annual pay : "+annualPay);

    }
}
