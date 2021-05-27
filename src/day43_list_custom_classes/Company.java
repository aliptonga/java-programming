package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Alip";
        emp1.jobTitle = "SDET";
        emp1.work();
        System.out.println(emp1.name);
        System.out.println(emp1.jobTitle);

        Employee emp2 = new Employee();
        emp2.name = "Adil";
        emp2.jobTitle = "Full stack developer";
        emp2.work();
        System.out.println(emp2.name);
        System.out.println(emp2.jobTitle);
    }
}
