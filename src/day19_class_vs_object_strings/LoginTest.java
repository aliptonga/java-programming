package day19_class_vs_object_strings;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "alip";
        String ezpPassword = "a123";

        String userName = "Alip";
        String password = "a123";

        if (expUserName.equalsIgnoreCase(userName) && ezpPassword.equals(password)) {
            System.out.println("pass - user logged in successfully");
        }else {
            if (!expUserName.equalsIgnoreCase(userName)){
                System.out.println("Fail - username is incorrect");
            }else {
                System.out.println("Fail - password is incorrect");
            }
        }
    }
}
