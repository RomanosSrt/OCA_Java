package Inheritance;

public class Test1 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Rabbit rabbit = new Rabbit();
        cat.jump();
        rabbit.jump();
    }

}

class Animal {
    void jump() {
        System.out.println("Animal");
    }
}

class Cat extends Animal {
    void jump(int a) {
        System.out.println("Cat");
    }
}

class Rabbit extends Animal {
    void jump() {
        System.out.println("Rabbit");
    }
}