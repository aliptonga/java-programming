package day29_nestedloop_arrays;

public class CountCharsNestedLoop {
    public static void main(String[] args) {
        String word = "java";

        for (int outer = 0; outer < word.length(); outer++) {
            System.out.println("outer: " + word.charAt(outer));
            int count = 0;
            for (int inner = 0; inner < word.length(); inner++) {
                //System.out.println(word.charAt(inner));
                if (word.charAt(outer) == word.charAt(inner)) {
                    count++;
                }
            }
            System.out.println(word.charAt(outer) + "=" + count);
        }
    }
}
