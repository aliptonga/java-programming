package day09_scanner_practice;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class MileToKilometer {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("******* Mile to Kilometer ********");
        System.out.println("Enter mile : ");
        double Mile= scan.nextDouble();
        double Kilometer= Mile*1.609;
        System.out.println(Mile+" miles in kilometer : "+Kilometer+" Kilometer");

    }
}
