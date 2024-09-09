package Exam;

import java.time.LocalDate;

public class Test8 {
    public static void main (String args[]) {
        Book b1 = new Book("1234-5678");
        Book b2 = new Book("1234-5678");
        System.out.print(b1.equals(b2) + ":");
        System.out.println(b1 == b2);

    }
}

class Book {
    String ISBN;
    Book(String val) {
        ISBN = val;
    }

    int pages = 1000;

    public boolean equals(Book b) {
        return ISBN.equals(b.ISBN);
    }
}
