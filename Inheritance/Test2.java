package Inheritance;

public class Test2 {
    public static void main(String[] args) {
        softwareDeveloper rom = new softwareDeveloper();
        Agronomist rom1 = new Agronomist();
        rom.print();
        rom1.print();
    }
}

class softwareDeveloper {
    void print() {
        System.out.println("Romanos - Programmer");
    }
}

class Agronomist extends softwareDeveloper {
    void print() {
        System.out.println("Romanos - Data engineer");
    }
}
