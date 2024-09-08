package Exceptions;

public class Test2 {
    void method() {
        try {
            guru();
            return;
        } finally {
            System.out.println("finally 1");        //finally block will ALWAYS execute
        }
    }

    void guru() {
        System.out.println("guru");
        throw new StackOverflowError("fixed alert");
    }

    public static void main (String args[]) {
        Test2 t2 = new Test2();
        t2.method();
    }
}
