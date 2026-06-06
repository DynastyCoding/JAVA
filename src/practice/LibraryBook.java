package practice;

public class LibraryBook {

    private String title;
    private final int bookID;
    private boolean borrowed;
    private static int totalBooks;

    public LibraryBook(String title, int bookID){
        this.title = title;
        this.bookID = bookID;
        this.borrowed = false;
        totalBooks++;
    }

    public void borrowBook(){
        if(!borrowed){
             borrowed=true;
            System.out.println("Book borrowing successful.");
        }else{
            System.out.println("Book has been borrowed.");
        }
    }

    public void returnBook(){
        if(borrowed){
            borrowed=false;
            System.out.println("Book returning successful.");
        }else{
            System.out.println("Book hasn't been borrowed.");
        }
    }

    public String getTitle(){
        return title;
    }

    public static int getTotalBooks(){
        return totalBooks;
    }
}
