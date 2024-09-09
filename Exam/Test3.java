package Exam;

public class Test3 {
    public static void main(String args[]) {
        int x = 10;
        int y = 20;
        int z = 30;

        if (x+y%z > (x+(-y)*(-z))) {
            System.out.println(x+y+z);
        }
    }
}