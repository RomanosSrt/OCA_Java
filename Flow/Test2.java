package Flow;

public class Test2 {
    public static void main(String[] args) {
        int i = 10;
        do
            while (i++ < 15) {
                System.out.println(i);
                i += 20;
            }
        while (i < 2);
        System.out.println(i);
    }
}
