package day53_inheritance.hiding;

public class PhoneTests {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Mobile mobile = new Mobile();

        phone.call();
        mobile.text();
        mobile.call();
    }
}
