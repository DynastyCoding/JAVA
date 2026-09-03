package practice.stream;

import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        ProductService service = new ProductService();

        List<Product> products = List.of(
                new Product ("Laptop", 5),
                new Product("Mouse", 0),
                new Product("Keyboard", 3),
                new Product("Monitor",0)
        );

        List<String> available = service.getAvailableProductNames(products);

        System.out.println("Available products: " + available);

    }
}
