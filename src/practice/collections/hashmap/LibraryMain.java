package practice.collections.hashmap;

public class LibraryMain {
    public static void main(String[] args) {
        LibraryCatalog lib = new LibraryCatalog();

        lib.addBook("Java", "Duke");
        lib.addBook("SQL", "Levi");
        lib.addBook("Java", "Chovy");

        lib.printAllBooks();

        System.out.println(lib.getAuthor("Java"));
        System.out.println(lib.getAuthor("Python"));

        System.out.println(lib.getTotalBooks());

        System.out.println(lib.removeBook("SQL"));
        System.out.println(lib.removeBook("Python"));

        System.out.println(lib.getTotalBooks());
        lib.printAllBooks();

    }
}
