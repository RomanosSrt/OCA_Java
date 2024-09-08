package Inheritance;

public class TwistInTale1 {
    public static void main(String[] args) {
        System.out.println(new Programmer1("Harry").getName());
    }
}

class Employee1 {
    private String name;
    String address;
    protected String phoneNumber;
    public float experience;

    String getName() {
        return name;
    }

    void setName(String val) {
        name = val;
    }
}

class Programmer1 extends Employee1 {
    Programmer1(String val) {
        setName(val);
    }

}
