package Flow;

public class Test4 {
    public static void main(String[] args) {
        int num = 10;
        final int num2 = 20;
        switch (num) {
            case num2:
                System.out.println(5);
                break;
            case 10 * 3:
                System.out.println(2);
                break;
            case 10 / 3:
                System.out.println(4);
                break;
            default:
                System.out.println("default");
        }
    }
}
