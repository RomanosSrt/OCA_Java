package Exam;

interface Keys{
    String keypad(String region, int keys);
}
public class Test2 {
    static double price;
    static String model;
    public static void main(String args[]) {
        //double price;         Local variables do not get automatically initialized
        //String model;         Wouldn't compile

        Keys varKeys = (region, keys) ->
                        {if (keys >= 32)
                        return region;
                        else return "default";};
        System.out.println(model + price + varKeys.keypad("AB",32));
    }
}