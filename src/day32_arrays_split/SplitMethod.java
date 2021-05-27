package day32_arrays_split;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {

        String words = "java:python:selenium:html";
        String[] wordsArray = words.split(":");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array = "+wordsArray.length);

        for (String each : wordsArray) {
            System.out.println(each);
        }

        String sentence = "today I am coding java arrays";
        String[] sentenceArray = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArray));
        System.out.println("first word: " + sentenceArray[0]);
        System.out.println("first word: " + sentence.split(" ")[0]);
        System.out.println("length of array = " + sentenceArray.length);

        for (String wordsInSentence : sentenceArray) {
            System.out.println(wordsInSentence);
        }

    }
}
