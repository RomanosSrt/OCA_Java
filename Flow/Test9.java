package Flow;

public class Test9 {
    public static void main(String[] args) {
        int i = 0;
        for (; i < 2; i += 5) {
            if (i < 5)
                continue;
            System.out.println(i);
        }
        System.out.println(i);
    }
}
