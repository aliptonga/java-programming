package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length() == 0);

        if (jobTitle.isEmpty()) {
            System.out.println("Job title is missing, please resend");
        }else {
            System.out.println("Job title looks good");
        }

        if (jobTitle.length() ==0) {
            System.out.println("Job title is empty, please resend");
        }else {
            System.out.println("Job title is not empty");
        }

        System.out.println(jobTitle.equals(""));

        if ("".equals(jobTitle)) {
            System.out.println("Job title is empty, please resend");
        }else {
            System.out.println("Job title is not empty");
        }

        String word = " ";
        System.out.println(word.isEmpty());
        System.out.println(word.length());

        String veggie = "carrots";
        System.out.println(veggie.isEmpty());
        //if veggie IS not empty , print we have carrots
        if (!word.isEmpty()) {
            System.out.println("we have carrots ");
        }else {
            System.out.println("we do not have carrots");
        }
        String word2;
        //System.out.println(word2.isEmpty()); ERROR. Not initialized
    }
}
