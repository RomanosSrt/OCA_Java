package Exceptions;

import java.io.*;

public class TryCatchFinally {
    public static void main(String args[]) {
        TestException testing = new TestException();
        System.out.println("Final message: " + testing.inform());
    }
}

class TestException {
    FileInputStream fis = null;
    StringBuffer message = new StringBuffer("Ooops!..");

    StringBuffer inform() {

        try {
            fis = new FileInputStream("file.txt");
            System.out.println("File Opened");
            fis.read();
            System.out.println("File read");
        } catch (FileNotFoundException fnfe) {
            System.out.println(message + " Error 404: File not found");
            return message;
        } catch (IOException ioe) {
            System.out.println("I/O Exception");
        } finally {
            try {
                fis.close();
            } catch (IOException ioe) {
                System.out.println("No need to close file that doesn't exists");
            } catch (NullPointerException empty) {
                System.out.println("No file");
            }
            System.out.println("Finally");
            message.append(" That was unfortunate.");
        }
        return message;
    }
}