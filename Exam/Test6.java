package Exam;

public class Test6 {
    public static void main(String args[]) {
        Phone phone = new Phone();
        Phone smartphone = new smartPhone();
        phone.call();
        smartphone.call();
        ((smartPhone)smartphone).call();
    }
}

class Phone {
    static void call() {
        System.out.println("Call-Phone");
    }
}

class smartPhone extends Phone {
    static void call() {
        System.out.println("Call-SmartPhone");
    }
}