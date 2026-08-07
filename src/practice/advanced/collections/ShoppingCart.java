package practice.advanced.collections;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<String> items = new ArrayList<>();

    //增
    public void addItem(String item){
        if (item != null && !item.isEmpty()) {
            items.add(item);
        }
    }

    //刪
    public boolean removeItem(String item){
        return items.remove(item);
    }

    //刪：最後一筆
    public void removeLast(){
        if(!items.isEmpty()){
            items.remove(items.size()-1);
        }
    }

    //刪：全部商品
    public void clear(){
        items.clear();
    }


    //查：是否有
    public boolean contains(String item){
        return items.contains(item);
    }

    //查：總數
    public int getTotalItems(){
        return items.size();
    }

    //查：印出全部
    public void printCart(){
        System.out.print("Shopping Cart: [");
        for(int i =0; i<items.size(); i++){
            System.out.print(items.get(i));
            if(i<items.size()-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("apple");
        cart.addItem("banana");
        cart.addItem("orange");
        cart.addItem("apple");
        cart.addItem("milk");
        cart.addItem("bread");

        cart.printCart();

        cart.removeItem("banana");
        System.out.println("After remove banana: ");
        cart.printCart();

        System.out.println("Milk is in shopping cart: " + cart.contains("milk"));

        cart.removeLast();
        System.out.println("After remove last store: ");
        cart.printCart();

        System.out.println("Total numbers of store: " + cart.getTotalItems());

    }

}
