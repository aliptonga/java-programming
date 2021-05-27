package day36_method_with_return;
import java.util.*;
public class Info {
    public static void main(String[] args) {
        fullName();
        System.out.println("Full name : " +fullName());
        System.out.println("isMarried = " +isMarried());
        System.out.println("Age = " + getAge());
        System.out.println("Birth year = " + getRandomYear());

        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);

        if (isMarried()) {
            System.out.println("married");
        }else {
            System.out.println("single");
        }

    }
    public static String fullName() {
        System.out.println("inside full name method");
        return "Aliptonga Muhammad";
    }
    public static boolean isMarried() {
        return false;
    }
    public static int getAge() {
        int age = 22;
        return age;
    }
    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}
