package Inheritance;

public class TwistInTale4 {
    public static void main(String[] args) {
        new Programer().run();
    }
}

class Employe {
    String run() {
        System.out.println("Emp-run");
        return null;
    }

}

class Programer extends Employe {
    String run() {
        System.out.println("Programmer run diagnostics");
        return null;
    }
}