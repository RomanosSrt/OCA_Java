package Finals;

class ProjectLeader extends Programmer implements Iwork {
    private int employees;

    ProjectLeader(String s, String n) {
        super(s, n);
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int n) {
        this.employees = n;
    }

    public void manage(Developer d) {
        System.out.println("I " + super.name + " had a meeting with " + d.name
                + ". It was succesfull and I can say that we're ahead of schedule");
    }

    @Override
    public void work() {
        System.out.println("I work with " + getEmployees() + " people in my department");
    }
}
