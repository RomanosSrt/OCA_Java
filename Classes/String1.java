package Classes;

class Person {
    String name;

    Person() {
    }

    Person(String str) {
        name = str;
    }
}

public class String1 {
    public static void main(String... args) {
        // String morning1 = new String("Morning");
        // String morning2 = "Morning";
        // String morning3 = "ABCAB";
        // System.out.println(morning3.substring(0, 2));

        StringBuilder str1 = new StringBuilder("Hello from the other side");
        // str1.append("Java");
        // System.out.println(str1);
        // str1.append(new Person("Oracle").name);
        // System.out.println(str1);
        // str1.append(new StringBuilder(" "));
        // System.out.println(str1);
        // str1.append(new Person().name);
        // System.out.println(str1);
        // char[] myName = { 'R', 'o', 'm', 'a', 'n', 'o', 's' };
        // str1.append(myName, 3, 4);
        // System.out.println(str1);
        StringBuilder str2 = str1;
        str2.replace(0, 5, "Hi");
        System.out.println(str2);
        System.out.println(str1 == str2);
        System.out.println(str1);
        String str3 = new String("Hello from the other side");
        String str4 = str3;
        str4.replace("Hello", "Hi");
        System.out.println(str3);
        System.out.println(str3 == str4);
        System.out.println(str4);
    }
}
