package Classes;

import java.util.ArrayList;

public class TwistInTale4 {
    public static void main(String[] args) {
        ArrayList<String> myArrList = new ArrayList<>();
        String one = "One";
        String two = new String("Two");
        myArrList.add(one);
        myArrList.add(two);
        ArrayList<String> youArrayList = myArrList;
        one.replace("O", "B");
        System.out.println(youArrayList.contains(two));
        youArrayList.clear();
        for (String val : myArrList)
            System.out.print(val + ":");
        for (String val : youArrayList)
            System.out.print(val + ":");
        System.out.println(youArrayList);

    }
}
