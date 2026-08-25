package practice.advanced.collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class ProductPrice {

    private Map<String, Double> products = new HashMap<>();

    public void addOrUpdatePrice(String productId, double price){
        products.put(productId, price);
    }

    public double getPrice(String productId){
        if(products.containsKey(productId)){
            return products.get(productId);
        }else{
            return -1;
        }
    }

    public boolean containsProduct(String productId){
        if(products.containsKey(productId)){
            return true;
        }else{
            return false;
        }
    }

    public boolean removeProduct(String productId){
        if(products.containsKey(productId)){
            products.remove(productId);
            return true;
        }else{
            return false;
        }
    }

    public int getTotalProducts(){
        return products.size();
    }

    public void printAll(){
        if(products.isEmpty()){
            System.out.println("No products.");
        }else{
            for(String id : products.keySet()){
                System.out.println(id + ": $" + products.get(id));
            }
        }
    }

}
