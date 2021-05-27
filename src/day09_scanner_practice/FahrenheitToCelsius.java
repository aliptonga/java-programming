package day09_scanner_practice;
import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("******** Fahrenheit to Celsius *********");
        System.out.println("Enter fahrenheit : ");
        double fahrenheit= input.nextDouble();
        double celsius=(fahrenheit-32)*5/9;
        System.out.println(fahrenheit+"F in C"+celsius+"C");
    }
}
