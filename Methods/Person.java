package Methods;

class Person {
    public String name;
    public int height;

    Person(String s) {
        this.name = "Romanos";
    }

    Person(Object o) {
        name = "oxi Romanos";
    }

}

class eJavaGuru {
    public static void main(String[] args) {
        Person p = new Person("δοκιμη");
        p.name = "EJava";
        anotherMethod(p);
        System.out.println(p);

        System.out.println(p.name);
        someMethod(p);
        System.out.println(p.name);
    }

    static void someMethod(Person p) {
        System.out.println(p);
        p.name = "someMethod";
        System.out.println(p.name);
        System.out.println(p);
    }

    static void anotherMethod(Person p) {
        System.out.println(p);
        p.name = "anotherMethod";
        System.out.println(p);
        System.out.println(p.name);
    }
}
