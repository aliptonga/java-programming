package day14_multi_branch_if_statements;

public class LocagicalLANDOperator {
    public static void main(String[] args) {
        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&true);
        System.out.println(false&&false);
        System.out.println("\n");
        System.out.println(10==10&&2>1);
        System.out.println(20<3003&&10012==12);
        System.out.println(25==2525&&50==50);
        System.out.println(1232==76567&&1==2);

        int apples=10, oranges=5;
        boolean check=apples>9&&oranges==5;
        System.out.println("check = "+check);

        if (apples>7 && oranges>=5){
            System.out.println("we have enough!!");
        } else {
            System.out.println("we have to go to market");
        }
    }
}
