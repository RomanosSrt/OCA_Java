package Flow;

public class Test6 {
    public static void main(String[] args) {
        int num = 120;
        switch (num) {
            default:
                System.out.println("default");
            case 0:
                System.out.println("case1");
            case 10 * 2 - 201:
                System.out.println("case2");
                break;
        }
    }
}
