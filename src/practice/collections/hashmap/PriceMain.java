package practice.collections.hashmap;

public class PriceMain {
    public static void main(String[] args) {
        PriceList pl = new PriceList();

        pl.setPrice("apple", 50);
        pl.setPrice("banana", 30);
        pl.setPrice("apple", 60);
        pl.setPrice("", 10);
        pl.setPrice("grape", -5);

        pl.printAllPrices();

        System.out.println(pl.getPrice("apple"));
        System.out.println(pl.getPrice("durian"));

        System.out.println(pl.getTotalItems());

        System.out.println(pl.removeItem("banana"));
        System.out.println(pl.removeItem("durian"));

        System.out.println(pl.getTotalItems());

        pl.printAllPrices();

    }
}
