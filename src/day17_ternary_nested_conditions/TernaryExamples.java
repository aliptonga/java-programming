package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 75;
        String result = (score > 60) ? "Pass" : "Fail";
        System.out.println(result);

        String quality = "very good";
        int x = (quality.equals("good")) ? 100 : 0 ;
        System.out.println(x);

        char grade = (score > 90) ? 'A' : 'B';
        System.out.println(grade);

        String evenOdd = (score % 2 == 0) ? "even" : "odd";
        System.out.println(evenOdd);

    }
}
