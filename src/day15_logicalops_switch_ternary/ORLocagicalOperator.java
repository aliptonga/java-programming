package day15_logicalops_switch_ternary;

public class ORLocagicalOperator {
    public static void main(String[] args) {
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        int apples = 5;
        int banana = 7;

        System.out.println(apples > 3 || banana > 4);
        if (apples > 3 || banana > 4){
            System.out.println("no need to buy fruits today");
        } else {
            System.out.println("need to buy fruits today");
        }

        System.out.println(apples > 2 || banana > 10);
        System.out.println(apples > 2 && banana > 10);

        if (apples > 4 || banana > 10){
            System.out.println("Look like we do not have to go out today");
        } else {
            System.out.println("Go go go, we have to go out today");
        }

        System.out.println(apples == 0 || banana == 0);
        if (apples == 0 || banana == 0){
            System.out.println("we will not die today!");
        } else {
            System.out.println("we will die today");
        }
    }
}
