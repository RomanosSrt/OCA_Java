package Inheritance;

public class Test3 {
    public static void main(String[] args) {
        Mom mom = new Mom();
        Mom daughter = new Daughter();
        System.out.println(mom.var);
        System.out.println(daughter.var);
        mom.printVar();
        daughter.printVar();
    }
}

class Mom {
    String var = "Martha";

    void printVar() {
        System.out.println(var);
    }
}

class Daughter extends Mom {
    String var = "Peggy";

    void printVar() {
        System.out.println(var);
    }
}