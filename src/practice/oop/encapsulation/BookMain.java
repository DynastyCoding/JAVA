package practice.oop.encapsulation;

public class BookMain {
    public static void main(String[] args) {

        Book b1 = new Book("3body", "unknown", 888);
        Book b2 = new Book("3body2", "unknown2", 777);

        b1.printInfo();
        b2.printInfo();

        System.out.println("Title: " + b2.getTitle());
        System.out.println("Author: " + b2.getAuthor());
        System.out.println("Price: " + b2.getPrice());

        b1.setPrice(50);
        b1.printInfo();


    }
}
