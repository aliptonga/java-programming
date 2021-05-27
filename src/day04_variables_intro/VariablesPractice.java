package day04_variables_intro;

public class VariablesPractice {
    public static void main(String[] args) {
        //declare variable students that stores number
        int students; //declare ONCE
        students = 50; //assign 50
        System.out.println(students); //50
        System.out.println(students);
        students = 70;
        System.out.println(students);

        students = 111;
        students = 125;
        System.out.println(students);

        int teachers;
        teachers = 2;
        int mentors;
        mentors = 25;
        System.out.print("Number of teachers:");
        System.out.println(teachers); //2
        //print number of mentors
        System.out.print("Number of mentors:");
        System.out.println(mentors);
        System.out.println(students);
    }
}
