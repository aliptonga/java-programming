package day09_scanner_practice;
import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int result=num1+num2;
        System.out.println(result);

    }
}
