package Exceptions;

public class Test3 {
    public static void main(String args[]) {
        BaseClass b = new DerivedClass();
        b.itsMethod();
    }
}

class BaseClass {
    void itsMethod() throws ExceptionInInitializerError {
        System.out.println("Base");
    }
}

class DerivedClass extends BaseClass {
    void itsMethod() throws RuntimeException {
        System.out.println("Derived");
    }
}