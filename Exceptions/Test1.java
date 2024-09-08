package Exceptions;

public class Test1 {
    public static void main (String args[]) {
        Course c = new Course();
        c.courseName = "Java";
        System.out.println(c.courseName);
    }
}

class Course {
    String courseName;
    Course () {
        try {
            Course c = new Course();
            c.courseName = "Oracle";
        } catch (StackOverflowError soe) {          //bad practise to try-catch errors leave them to JVM
            System.out.println("Recursive constructor");
        }
    }
}