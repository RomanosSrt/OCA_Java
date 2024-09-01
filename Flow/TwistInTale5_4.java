package Flow;

public class TwistInTale5_4 {
    public static void main(String[] args) {
        String[] programmers = { "Outer", "Inner" };
        for (String outer : programmers) {
            for (String inner : programmers) {
                if (inner.equals("Inner"))
                    break;
                System.out.print(inner + ":");
            }
        }
    }
}
