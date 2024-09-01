package Classes;

import java.time.Period;
import java.util.ArrayList;

public class BankAccount {
    String acctNumber;
    int acctType;

    public boolean equals(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount b = (BankAccount) obj;
            return (acctNumber.equals(b.acctNumber) && acctType == b.acctType);
        } else {
            return false;
        }
    }
}

class TestMethodEquals {
    public static void main(String args[]) {
        BankAccount b1 = new BankAccount();
        b1.acctNumber = "0023490";
        b1.acctType = 4;
        ArrayList<BankAccount> list = new ArrayList<BankAccount>();
        list.add(b1);
        BankAccount b2 = new BankAccount();
        b2.acctNumber = "0023490";
        b2.acctType = 4;
        System.out.println(list.contains(b2));

        Period per1 = Period.ofMonths(3);
        per1 = per1.plusYears(2021);
        System.out.println(per1);
    }
}
