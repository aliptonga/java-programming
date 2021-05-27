package day19_class_vs_object_strings;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CyberTek";
        String sentence = "Java is FUN";

        System.out.println(word);
        System.out.println(word.toLowerCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toLowerCase());
        System.out.println("\n");
        System.out.println(word.toUpperCase());
        System.out.println("java".toUpperCase());
        System.out.println(sentence.toUpperCase());

        word.toLowerCase();
        System.out.println(word);

        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);
        //change word all lowercase letters. and assign back
        word = word.toLowerCase();
        System.out.println("word = " + word);
        System.out.println("\n");

        String company = "amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase - " + company.toUpperCase());
        System.out.println("java".toUpperCase());
        //change variable company "amazon" to " AMAZON"
        company = company.toUpperCase();
        System.out.println("company = " + company);
    }
}
