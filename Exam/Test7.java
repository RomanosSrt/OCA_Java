package Exam;

public class Test7 {
    public static void main(String args[]) {
        Student s1 = new Student();
        boost(s1);
        System.out.println(s1.grade);
    }

    public static void boost(Student s) {
        s.grade = "10";
    }
}

class Student {
    String grade = "5";

    static void boost() {
        //grade = "10";         Doesn't compile! Cannot access instance variables with static method
    }
}