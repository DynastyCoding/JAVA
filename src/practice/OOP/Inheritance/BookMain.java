package practice.OOP.Inheritance;

public class BookMain {
    public static void main(String[] args) {
        Book b = new Book("Java 101","John Doe", 350);
        EBook e = new EBook("Clean Code", "Robert Martin", 450,5);

        b.printInfo();
        e.printInfo();

        b.open();
        e.open();

        b.read();
        e.read();

        b.close();
        e.close();

        e.download();

        b.printInfo();
        e.printInfo();
    }
}
