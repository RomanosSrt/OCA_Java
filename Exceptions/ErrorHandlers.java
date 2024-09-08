package Exceptions;

public class ErrorHandlers {
    public static void main (String args[]) {
        try {
            myMethod();
        } catch (StackOverflowError soe) {
            for (int i=0; i < 2; ++i)
                System.out.println(i);
        }
    }
    public static void myMethod() {
        //myMethod();

        int y = (int)(-100.76/0);
        System.out.println(y);
    }
}