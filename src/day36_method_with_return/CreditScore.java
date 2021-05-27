package day36_method_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(700);
        checkEligible(690);
        checkEligible(729);

        System.out.println(getCreditScore());
        int score = getCreditScore();
        System.out.println("score = " + score);

    }
    public static void checkEligible(int creditScore) {
        if (creditScore >= 700) {
            System.out.println("you are eligible for leasing this car");
        }else {
            System.out.println("Sorry, you are not eligible for leasing this car");
        }
    }
    public static int getCreditScore() {
        return 800;
    }
}
