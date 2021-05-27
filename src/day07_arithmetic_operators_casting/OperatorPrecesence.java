package day07_arithmetic_operators_casting;

public class OperatorPrecesence {
    public static void main(String[] args){
        System.out.println(10+5);
        System.out.println(10-5+3);
        System.out.println(10-(5+3));
        System.out.println(400/(5*4));
        System.out.println(1000/501);
        System.out.println(1000.0/501.0);
        System.out.println(5.0/2.0);
        System.out.println(5/2);

        int num1=40;
        int num2=15;
        System.out.println(num1/num2);

        double number1=40.0;
        double number2=15.0;
        System.out.println(number1/number2);

        int n1=40;
        double n2=15.0;
        System.out.println(n1/n2);


    }
}
