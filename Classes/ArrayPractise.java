package Classes;

import java.util.*;;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.ListIterator;

public class ArrayPractise {
    public static void main(String[] args) {
        // String[] myArray = new String[] { "Hi,", "my name", "is", "Romanos" };
        // int intArray2[] = new int[] { 0, 1 };
        // String[] strArray2 = new String[] { "Summer", "Winter" };
        // int multiArray2[][] = new int[][] { { 0, 1 }, { 3, 4, 5 } };
        // System.out.println(myArray);
        // Object[] objArray = new Object[] {new int[2]};

        ArrayList<String> aList = new ArrayList<>();
        aList.add("one");
        aList.add("two");
        aList.add("four");
        aList.add(2, "three");
        // ListIterator<String> iterator = aList.listIterator();
        // while (iterator.hasNext()) {
        // System.out.println(iterator.nextIndex());
        // System.out.println(iterator.next());
        // }
        // System.out.println(iterator.next());

        // for (String element : aList) {
        // element += element.length();
        // System.out.println(element);
        // }
        // for (String element : aList) {
        // System.out.println(element);
        // }

        aList.remove(1);
        aList.remove("one");

        for (String element : aList) {
            System.out.println(element);
        }
        System.out.println(aList);
        int[] arr = new int[5];
        byte b = 4;
        char c = 'c';
        long longVar = 10;
        arr[0] = b;
        arr[1] = c;
        arr[3] = (int) longVar;

        System.out.println(/* arr[0] + */ arr[1] /* + arr[2] + arr[3] */);

    }
}
