package Flow;

public class Test3 {
    public static void main(String[] args) {
        int a = 10;
        if (a++ > 10) {
            System.out.println("true");
        }
        {
            System.out.println("false");
        }
        System.out.println("ABC");
    }
}
