package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {

        String weather="sunny";
        if (weather=="sunny"){
            System.out.println("Go to park, hiking, and code java");

        } else if (weather=="rainy"){
            System.out.println("stay at home, drink beer, and code java");
        } else if (weather=="snowy"){
            System.out.println("clean the car then build snowman, drink hot chocolate, and code java");
        } else if (weather=="windy"){
            System.out.println("Get ready for power loss, fly a kite, and code java");
        } else {
            System.out.println("just keep coding java");
        }


    }
}
