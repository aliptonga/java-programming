package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;
        //while(isHungry && bananas != countToFull)
        while (isHungry) {
            bananas++;
            System.out.println("Eating a banana: \uD83C\uDF4C " + bananas);
            if (bananas == countToFull) {
                isHungry = false;
            }

        }
        System.out.println("oohhhhh so full, lets get back to steady");
    }

}
