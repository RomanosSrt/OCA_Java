package Flow;

public class Test5 {
    public static void main(String[] args) {
        int num = 10;
        final int num2 /*
                        * ;
                        * num2
                        */ = 20; /*
                                  * can't be declarated separately it is a constant value,
                                  * but not a COMPILE-TIME CONSTANT VALUE
                                  */
        switch (num) {
            case num2:
                System.out.println(5);
                break;
        }
    }
}
