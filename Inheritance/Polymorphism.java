package Inheritance;

public class Polymorphism {
    public static void main(String[] args) {
        Manager emp1 = new Manager();
        Programmer2 emp2 = new Programmer2();
        emp1.reachOffice();
        emp2.reachOffice();
        emp1.startWork();
        emp2.startWork();
    }
}

abstract class Employee2 {
    protected void reachOffice() {
        System.out.println("I have arrived at headquarters");
    }

    public void startWork() {
        System.out.println("I'm greeting the reception");
    }
}

class Programmer2 extends Employee2 {
    public void startWork() {
        System.out.println("Open laptop");
        System.out.println("Write java");
    }
}

class Manager extends Employee2 {
    public void startWork() {
        System.out.println("Sit at the Office");
        System.out.println("Plan meeting");
        System.out.println("Check out progress");
    }
}