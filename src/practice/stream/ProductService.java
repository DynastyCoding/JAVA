package practice.stream;

import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    // 從商品清單中，過濾出有庫存的商品，並回傳商品名稱
    public List<String> getAvailableProductNames(List<Product> products) {
        return products.stream()
                .filter(product -> product.getStock() > 0)   // 只留有庫存的
                .map(product -> product.getName())           // 轉成商品名稱
                .collect(Collectors.toList());               // 收集成 List<String>
    }
}