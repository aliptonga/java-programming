package aaa;

public class test {
    public static void main(String[] args) {
        int score = 0;
        if (score == 0) {
            score += 50;
        }
        if (score != 0) {
            score += 50;
        }
        System.out.println(score);


        int num = 9;
        if (num++ == 10) {
            System.out.println("alip" + num);
        }else {
            System.out.println("aaaa" + num);
        }

        int number = 10;
        if (--number > 10) {
            System.out.println("alip" + number);
        }else if (number == 9) {
            System.out.println("aaaaa" + number);
        }

        boolean A = true , B = !false;
        if (B) {
            System.out.println("B");
        }else if (A) {
            System.out.println("A");
        }else {
            System.out.println("C");
        }
    }
}
 