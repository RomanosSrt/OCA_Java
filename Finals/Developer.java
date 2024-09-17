package Finals;

import java.util.ArrayList;

class Developer extends Programmer implements Iwork {
    ArrayList<String> languages;

    Developer(String s, String n) {
        super(s, n);
        languages = new ArrayList<>();
    }

    public String write_code() {

        return "Java";
    }

    @Override
    public void work() {
        System.out.println("I work in this fierld for " + getExp() + " years");
    }
}
