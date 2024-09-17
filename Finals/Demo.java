package Finals;

import java.util.ArrayList;

public class Demo {
    static int k = 0;

    public static void main(String[] args) {
        ArrayList<Developer> developers = new ArrayList<>();
        ArrayList<ProjectLeader> projectLeaders = new ArrayList<>();
        ArrayList<Iwork> workers = new ArrayList<>();

        Developer dev1 = new Developer("Marios Mariou", "km123");

        developers.add(dev1);

        (new Tester("Romanos Sarantidis", "mppl2327")).test(dev1.write_code());

        (new ProjectLeader("George Georgiou", "mk891")).manage(dev1);

        work_now(dev1);
        System.out.println(work_now(new ProjectLeader("George Georgiou", "mk891")));
    }

    static int work_now(Iwork i) {
        return ++k;
    }
}
