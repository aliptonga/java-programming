package day09_scanner_practice;
import java.util.Scanner;
public class SpeedCheckV1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter curent speed: ");
        int speedLimit=55;
        int curentSpeed= scan.nextInt();
        int overTheLimint=curentSpeed-speedLimit;
        System.out.println("You are driving "+overTheLimint+" mph over the limmit. Slow sown!!!");
    }
}
