package Finals;

class Programmer {
    protected String name;
    protected String afm;
    private String address;
    private String phone;
    private int exp;

    Programmer(String s, String n) {
        this.name = s;
        this.afm = n;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String s) {
        this.address = s;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String s) {
        this.phone = s;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int n) {
        this.exp = n;
    }
}
