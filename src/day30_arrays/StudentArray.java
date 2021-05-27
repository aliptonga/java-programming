package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
        student1[0] = "AM1234";
        student1[1] = "Alip";
        student1[2] = "Muhammad";
        student1[3] = "B22";
        student1[4] = "603-617-8388";

        String[] student2 = {"AD2828" , "Adil" , "Ablat" , "B22" , " 405-887-7905"};

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstname = " + student1[1]);
        System.out.println("student1 lastName = " + student1[2] );
        System.out.println("student1 batch num = " + student1[3]);
        System.out.println("student1 mobile num = " + student1[4]);

        System.out.println("student data length: " + student1.length);

        /**check if student1 data array contains 5 items.
         true: PASS: data array has correct length
         false: FAIL: data array has incorrect length */

        if (student1.length == 5) {
            System.out.println("PASS: data array has correct length");
        } else {
            System.out.println("FAIL: data array has incorrect length");
        }

        /**
         check if student1 and student2 arrays have same number of data
         TRUE: PASS: data arrays length match
         FALSE: FAIL: data arrays length mismatch
         */
        if (student1.length == student2.length) {
            System.out.println("PASS: data arrays length match");
        } else {
            System.out.println("FAIL: data arrays length mismatch");
        }

        /**
         read from array and print firstname and lastname in all uppercase
         ADAM SMITH
         */
        //  "Adam" --> "ADAM"                "Smith"  --> "SMITH"
        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());
    }
}
