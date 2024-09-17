package Finals;

class Tester extends Programmer implements Iwork {

    Tester(String s, String n) {
        super(s, n);
    }

    public boolean test(String code) {
        if (code.length() > 5)
            return false;

        return true;
    }

    @Override
    public void work() {
        System.out.println("I am new here, I'm just a tester");
    }
}
