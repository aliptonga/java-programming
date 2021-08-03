package day53_inheritance.final_keyword;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.AADMIN_USERNAME);
        //TestData.ADMIN_USERNAME = "change"; ERROR: cannot change value of final variable
        final int SSN = 4321432;
        //SSN = 1234455;  ERROR: variable is final
    }
}
