package practice.collections.hashmap;

public class InventoryManageMain {
    public static void main(String[] args) {
        InventoryManager im = new InventoryManager();

        im.addStock("A001", 50);
        im.addStock("A002", 30);
        im.addStock("A001", 20);

        im.printAll();

        System.out.println("Stock A001: " + im.getStock("A001"));
        System.out.println("Stock A999: " + im.getStock("A999"));

        System.out.println("Sell A001 x20: " + im.sellItem("A001", 20));
        System.out.println("Sell A001 x60: " + im.sellItem("A001", 60));
        System.out.println("Sell A999 x5: " + im.sellItem("A999", 5));
        System.out.println("Sell A002 x-3: " + im.sellItem("A002", -3));

        System.out.println("Stock A001: " + im.getStock("A001"));

        System.out.println("Total items: " + im.getTotalItems());

        im.printAll();
    }
}
