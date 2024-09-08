package Exceptions;

import java.io.*;

public class TryCatchFinally {
    public static void main(String args[]) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("file.txt");
            System.out.println("File Opened");
            fis.read();
            System.out.println("File read");
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error 404: File not found");
        } catch (IOException ioe) {
            System.out.println("I/O Exception");
        } finally {
            System.out.println("Finally");
            try {
                fis.close();
            } catch (NullPointerException ioe) {
                System.out.println("Nothing to close");
            }

        }
        System.out.println("Next Task ...");
    }
}