package day09_scanner_practice;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter price for milk:");
        double milk= scan.nextDouble();

        System.out.println("Enter price for bread:");
        double bread= scan.nextDouble();

        System.out.println("Enter price for cucumber:");
        double cucumber= scan.nextDouble();

        double totalPrice=milk+bread+cucumber;
        System.out.println("Total price is : "+totalPrice);
    }
}
