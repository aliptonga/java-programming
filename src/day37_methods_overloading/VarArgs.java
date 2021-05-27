package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(123,123,45,654,4656,679,970,7895,4567);
        addNumbers();
        addNumbers(10,10);

    }
    public static void addNumbers(int... nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;

        }
        System.out.println("sum = " + sum);
    }
}
