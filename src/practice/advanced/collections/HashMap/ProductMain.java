package practice.advanced.collections.HashMap;

public class ProductMain {
    public static void main(String[] args) {
        ProductPrice pm = new ProductPrice();

        pm.addOrUpdatePrice("P001", 199.0);
        pm.addOrUpdatePrice("P002", 599.5);
        pm.addOrUpdatePrice("P001", 299.0);  // 更新 → 299.0

        pm.printAll();
        // P001: $299.0
        // P002: $599.5

        System.out.println("P001 price: $" + pm.getPrice("P001"));     // 299.0
        System.out.println("P999 price: $" + pm.getPrice("P999"));     // -1.0

        System.out.println("Has P001: " + pm.containsProduct("P001")); // true
        System.out.println("Has P999: " + pm.containsProduct("P999")); // false

        System.out.println("Remove P002: " + pm.removeProduct("P002")); // true
        System.out.println("Remove P999: " + pm.removeProduct("P999")); // false

        System.out.println("Total products: " + pm.getTotalProducts()); // 1

        pm.printAll();
        // P001: $299.0
    }
}
