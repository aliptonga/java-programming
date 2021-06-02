package day48_constructors_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator.add(5, 3);

        Calculator calcObject = new Calculator();
        calcObject.multiply(2, 40);

        calcObject.add(10, 40);
    }
}
