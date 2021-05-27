package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Tampa";
        if (city.equals("Moscow") || city.equals("Tampa")){
            System.out.println("Willing to relocate to " + city);
        }else {
            System.out.println("Not considering - " + city);
        }

        String teacher = "saim";
        if (teacher.equals("saim") || teacher.equals("muradel")){
            System.out.println("It is java class with "+ teacher);
        }else {
            System.out.println("Soft skill class with " + teacher);
        }

        if (teacher.equals("saim") || teacher.equals("muradel")){
            System.out.println("java class with " + teacher);
        }else if (teacher.equals("nadir")){
            System.out.println("soft skill class with " + teacher);
        }else {
            System.out.println("some other class with " + teacher);
        }

        String company = "google";
        double salary = 85_000.0;
        if (company.equals("google") || salary >= 100_000) {
            System.out.println("accepting offer from " + company);
        }else {
            System.out.println("rejecting offer from " + company);
        }
    }
}
