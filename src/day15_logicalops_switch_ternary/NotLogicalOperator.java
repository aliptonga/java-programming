package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 22;

        if (!(age > 7)) {
            System.out.println("Need to sit in child car seat. age = " + age);
        }else {
            System.out.println("Can sit normal seat. age = " + age);
        }

        boolean isSmokingAllowed = true;
        if (!isSmokingAllowed) {
            System.out.println("Smoking is not allowed here. Exit!");
        }else {
            System.out.println("This area is for smoking");
        }

        boolean isAffordeble = true;
        if (!isAffordeble) {
            System.out.println("Item is not affordable");
        }else {
            System.out.println("Item is affordable");
        }

        String env = "qa";
        if (!env.equals("qa")) {
            System.out.println("In wrong environment for QA testing");
        }

        String carModel = "Tesla";
        if (!carModel.equals("Tesla")) {
            System.out.println("Not interested, thank you");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if (!inputPassword.equals("abc123")) {
            System.out.println("Incorrect password");
        }

        if (!inputPassword.equals(secretPassword)) {
            System.out.println("Incorrect password");
        }

    }
}
