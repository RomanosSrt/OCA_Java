package Exceptions;

public class Test4 {
    void foo() {
        try {
            String s = null;
            System.out.println("1");
            try {
                System.out.println(s.length());
            } catch (NullPointerException e) {
                System.out.println("inner");
            }
            System.out.println("2");
        } catch (NullPointerException e) {
            System.out.println("outer");
        }
    }

    public static void main(String args[]) {
        Test4 t4 = new Test4();
        t4.foo();
    }
}
