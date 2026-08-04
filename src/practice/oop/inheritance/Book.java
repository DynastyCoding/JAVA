package practice.oop.inheritance;

public class Book {
    protected String title;
    protected String author;
    protected int pages;

    public Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void open(){
        System.out.println("Opening " + title);
    }

    public void read(){
        System.out.printf("Reading %s by %s.%n",title, author);
    }

   public void close(){
       System.out.println("Closing " + title);
   }

   public void printInfo(){
       System.out.printf("Title: %s, Author: %s, pages: %d.%n",title,author,pages);
   }
}
