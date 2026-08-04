package practice.oop.encapsulation;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        if (price >= 0 && price <= 1000) {
            this.price = price;
        } else {
            this.price = 0;
            System.out.println("Invalid input, set to 0.");
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price >= 0 && price <= 1000) {
            this.price = price;
        } else {
            this.price = 0;
            System.out.println("Invalid input, set to 0.");
        }
    }

    public void printInfo() {
        System.out.println("| " + title + " | " + author + " | " + price);
    }
}
