package practice;

import java.util.Scanner;
/**
 * Array & for-loop based library console application.
 * <p>
 * Manages multiple books using array and for-loop iteration.
 */
public class MainLibrary {
    public static void main(String[] args){

        LibraryBook[] books = {
                new LibraryBook("NYCU",113),
                new LibraryBook("NTHU",114),
        };

        Scanner in = new Scanner(System.in);
        int sel;
        do {
            System.out.println("""
                    Please select your operation:
                    1.borrow book
                    2.return book
                    3.query total number of books
                    4.exit
                    """);
            sel = in.nextInt();
            if (sel == 1) {
                System.out.println("Books list:");
                for (int i = 0; i < books.length; i++) {
                    System.out.println((i + 1) + "." + books[i].getTitle());
                }

                System.out.println("choose book you want to borrow:");
                int bookChoice = in.nextInt();
                while (bookChoice < 1 || bookChoice > books.length) {
                    System.out.println("Invalid input, choose again");
                    bookChoice = in.nextInt();
                }
                books[bookChoice - 1].borrowBook();

            } else if (sel == 2) {
                System.out.println("Books list:");
                for (int i = 0; i < books.length; i++) {
                    System.out.println((i + 1) + "." + books[i].getTitle());
                }

                System.out.println("choose book you want to return:");
                int bookChoice = in.nextInt();
                while (bookChoice < 1 || bookChoice > books.length) {
                    System.out.println("Invalid input, choose again");
                    bookChoice = in.nextInt();
                }
                books[bookChoice - 1].returnBook();

            } else if (sel == 3) {
                System.out.println("Total books is:" + LibraryBook.getTotalBooks());

            } else if (sel == 4) {
                System.out.println("Thank you!");
            } else {
                System.out.println("Invalid import, please select again.");
            }
        }while(sel!=4);
    }
}
