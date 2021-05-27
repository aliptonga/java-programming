package day07_arithmetic_operators_casting;

public class PrimitiveCasting {
    public static void main(String[] args){
        int nn1=4;
        byte bb1=(byte)nn1;
        System.out.println(bb1);

        byte bb2=55;
        int nn2=bb2;
        System.out.println(nn2);

        int num1=100;
        byte b1=(byte)num1;
        short s1=(short)num1;
        long l1=num1;
        System.out.println(num1);
        System.out.println(b1);
        System.out.println(s1);
        System.out.println(l1);
        //TODO: continue more practice on Casting
    }
}
