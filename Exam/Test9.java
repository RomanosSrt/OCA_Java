package Exam;
import java.util.ArrayList;
public class Test9 {

    public static void main (String args[]) {
        try {
            ArrayList<String> seasons = new ArrayList<>();
            //seasons.add(0, "The seasons");
            seasons.add(1, "Spring");
            seasons.add(2, "Summer");
            seasons.add(3, "Autumn");
            seasons.add(4, "Winter");
            seasons.remove(2);


            for (String s : seasons)
                System.out.println(s + ", ");
        } catch (IndexOutOfBoundsException aioob) {
            System.out.println("ArrayList element accessed not initialized");
        } finally {

            System.out.println("Finished");
        }

        
    }
}

