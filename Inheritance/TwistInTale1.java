package Inheritance;

public class TwistInTale1 {
    public static void main(String[] args) {
        System.out.println(new Programmer("Harry").getName());
    }
}

class Employee {
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

class Programmer extends Employee {
    Programmer(String val) {
        setName(val);
    }

}
