package Inheritance;

import java.util.ArrayList;

import Classes.String1;

public class LambdaExp {
    public static void main(String[] args) {
        Emp e1 = new Emp("Romanos", 8, 1000);
        Emp e2 = new Emp("Alex", 7, 2000);
        Emp e3 = new Emp("Lyk", 9, 1300);

        ArrayList<Emp> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e3);
        empList.add(e2);

        // Validate Authenticator = e -> e.getPerformanceRating() >= 8; LAMBDA
        // EXPRESSION

        Validate Authenticator = (Emp e) -> {
            return (e.getSalary() >= 1200);
        };
        filter(empList, Authenticator);

        // filter(empList, new Authenticator());
    }

    static void filter(ArrayList<Emp> list, Validate rule) {
        for (Emp e : list)
            if (rule.check(e))
                System.out.println(e.myCreds());
    }
}

interface Validate {
    boolean check(Emp emp);
}

class Emp {
    private String name;
    private int performanceRating;
    private double salary;

    Emp(String nm, int rate, double pay) {
        name = nm;
        performanceRating = rate;
        salary = pay;
    }

    public String getName() {
        return name;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    public double getSalary() {
        return salary;
    }

    public String myCreds() {
        return name + ":" + performanceRating + ":" + salary;
    }
}

/*
 * REPLACES CLASS AUTHENTICATOR
 * class Authenticator implements Validate {
 * public boolean check(Emp emp) {
 * return (emp.getPerformanceRating() >= 8);
 * }
 * }
 */