package practice.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class PriceList {

    private Map<String, Integer> lists = new HashMap<>();

    public boolean setPrice(String item, int price) {
        if (item == null || item.isEmpty() || price < 0) {
            return false;
        } else {
            lists.put(item, price);
            return true;
        }
    }

    public int getPrice(String item) {
        if (lists.containsKey(item)) {
            return lists.get(item);
        } else {
            return -1;
        }
    }

    public boolean removeItem(String item) {
        if (lists.containsKey(item)) {
            lists.remove(item);
            return true;
        } else {
            return false;
        }
    }

    public int getTotalItems() {
        return lists.size();
    }

    public void printAllPrices() {
        if (lists.isEmpty()) {
            System.out.println("No lists.");
        } else {
            for (String item : lists.keySet()) {
                System.out.println(item + ": " + lists.get(item));
            }
        }
    }
}