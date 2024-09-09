package Exam;

public class Test5 {
    public static void main(String args[]) {
        First[] me = {new First(), new First()};
        me[0].name = "Oxi Romanos";

        for (First f : me) f = new First();
        for (First f : me) System.out.println(f.name);
    }
}

class First {
    String name = "Romanos";
}