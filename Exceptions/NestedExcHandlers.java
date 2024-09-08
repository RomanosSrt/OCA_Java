package Exceptions;
import java.io.*;

public class NestedExcHandlers {
    static FileInputStream players, coach;
    public static void main (String args[]) {
        try {
            players = new FileInputStream("players.txt");
            System.out.println("players.txt found");

            try {
                coach.close();
            } catch (IOException ioe) {
                System.out.println("coach.txt not found");
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("players.txt not found");
        } catch (NullPointerException npe) {
            System.out.println("Null Pointer Exception");
        }
    }
}