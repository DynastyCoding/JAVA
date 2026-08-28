package practice.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {

    private Map<String, Integer> map = new HashMap<>();

    public void addStock(String itemId, int quantity){
        if(map.containsKey(itemId)){
            map.put(itemId, map.get(itemId) + quantity);
        }else{
            map.put(itemId, quantity);
        }
    }

    public boolean sellItem(String itemId, int quantity){
        if(!map.containsKey(itemId)){
            System.out.println("Sell failed: item not found.");
            return false;
        }
        if(quantity <= 0){
            System.out.println("Sell failed: invalid quantity.");
            return false;
        }
        int currentStock = map.get(itemId);
        if(currentStock < quantity){
            System.out.println("Sell failed: insufficient stock.");
            return false;
        }
        map.put(itemId, currentStock - quantity);
        return true;
    }

    public int getStock(String itemId){
        if(map.containsKey(itemId)){
            return map.get(itemId);
        }else{
            return -1;
        }
    }

    public int getTotalItems(){
        return map.size();
    }

    public void printAll(){
        for(String key : map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }
    }
}
