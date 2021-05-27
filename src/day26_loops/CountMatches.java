package day26_loops;

public class CountMatches {
    public static void main(String[] args) {
        String word = "java";
        char _letter = 'a';
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == _letter) {
                count++;
            }
        }
        System.out.println("There are " + count + " " + _letter +"'s in " + word);

    }
}
