package practice.OOP.Encapsulation;

public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product("P001", "筆電", 25000, 10);
        p1.printInfo();

        System.out.println();

        Product p2 = new Product("P002", "手機", -500, 5);
        p2.printInfo();

        System.out.println();

        p1.reduceStock(3);
        p1.reduceStock(20);
        p1.printInfo();
    }
}