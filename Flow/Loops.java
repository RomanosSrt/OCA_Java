package Flow;

public class Loops {
    public static void main(String args[]) {
        String result = "1";
        int score = 10;
        boolean cond;
        // if ((score += 10) == 100)
        if (cond = true)
            result = "A";
        else if ((score += 50) == 100)
            result = "B";
        else
            result = "C";
        System.out.println(result + ":" + score);
    }
}
