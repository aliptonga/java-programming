package day25_loops;

public class ForLoopFirst {
    public static void main(String[] args) throws InterruptedException {
        /**
         * below is infinite loop with for loop like: while(true) {    }
        for (;;) {
            System.out.println("java is fun");
        }
         */
        for (int i = 0; i <=5; i++) {
            System.out.println("hello world");
            Thread.sleep(500);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            Thread.sleep(500);
        }

    }
}
