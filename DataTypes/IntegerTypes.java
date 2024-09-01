package DataTypes;

import Basics.Course;

public class IntegerTypes {
    public static void main(String args[]) {
        Course course = new Course();
        int baseDecimal = 267;
        int octVal = 0413;
        int hexVal = 0x1a0b;
        int binVal = 0b100001011;
        Boolean boolValue = new Boolean(true);
        int var1 = -12;
        int var2 = 98;
        Character b1 = 'e';
        Character b2 = 'e';

        Boolean buy = new Boolean(true);
        Boolean sell = new Boolean(true);
        System.out.println(buy);
        System.out.println(sell);

        boolean buyPrim = buy.booleanValue();
        System.out.print(buyPrim);

        System.out.print(buy && sell);

    }

    public static int Something(int x) {
        x = x + 10;
        return x;
    }

}
