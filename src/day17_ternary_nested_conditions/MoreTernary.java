package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate =50;
        String reply = (hourlyRate >= 50) ? "accept" : "reject";
        System.out.println("reply = " + reply);

        String todaysClass = "java";
        String teather = (todaysClass.equals("java")) ? "nader" : "alip";
        System.out.println("tether = " + teather);

        Boolean isEligibleToDrive = true;
        String driving = isEligibleToDrive ? "has DL" : "no DL";
        System.out.println("driving = " + driving);
    }
}
