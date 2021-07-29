package day52_inheritance.discordusers;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1234);
        user1.setName("alip");
        user1.setRole("god");

        Admin admin1 = new Admin();
        admin1.setId(45734);
        admin1.setName("asdgf");
        admin1.setRole("Admin");

        System.out.println(user1);
        System.out.println(admin1);
    }
}
