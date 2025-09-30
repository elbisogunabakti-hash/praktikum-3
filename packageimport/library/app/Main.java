package packageimport.library.app;


import packageimport.library.model.Book;
import packageimport.library.model.Member;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Pemrograman Java", "Andi");
        Book b2 = new Book("Struktur Data", "Budi");

        Member m1 = new Member("Siti", 101);
        Member m2 = new Member("Joko", 102);

        b1.info();
        b2.info();
        m1.info();
        m2.info();
    }
}
