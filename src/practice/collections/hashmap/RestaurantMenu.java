package practice.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RestaurantMenu {

    private Map<String, Integer> menus = new HashMap<>();

    public  boolean addDish(String dish, int price){
        if(dish == null || dish.isEmpty() || menus.containsKey(dish) || price<=0){
            return false;
        }else{
            menus.put(dish, price);
            return true;
        }
    }

    public boolean updatePrice(String dish, int newPrice ){
        if(menus.containsKey(dish) && newPrice>=0){
            menus.put(dish, newPrice);
            return true;
        }else{
            return false;
        }
    }

    public int getPrice(String dish){
        if(menus.containsKey(dish)){
            return menus.get(dish);
        }else{
            return -1;
        }
    }

    public boolean removeDish(String dish){
        if(menus.containsKey(dish)){
            menus.remove(dish);
            return true;
        }else{
            return false;
        }
    }

    public int getTotalDishes(){
        return menus.size();
    }

    public void printMenu(){
        if(menus.isEmpty()){
            System.out.println("No dishes.");
        }else{
            for(String dish: menus.keySet()){
                System.out.println(dish + ": " + menus.get(dish));
            }
        }
    }
}
