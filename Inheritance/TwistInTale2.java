package Inheritance;

public class TwistInTale2 {
    public static void main(String[] args) {
        attributes[] something = new attributes[] {
                new child(),
                new child2()
                // new base() can't refer to base obj with a child/interface reference
                // new attributes() can't instantiate interfaces
        };
        for (int i = 0; i < 2; i++) {
            ((base) something[i]).greet(); // casting parent class to list of interfaces
            something[i].print();
        }
    }
}

class base {
    void greet() {
        System.out.print("I am a boy and ");
    }
}

interface attributes {
    void print();
}

class child extends base implements attributes {
    public void print() {
        System.out.println("I am the first child");
    }
}

class child2 extends base implements attributes {
    @Override
    public void print() {
        System.out.println("I am the second child");
    }
}