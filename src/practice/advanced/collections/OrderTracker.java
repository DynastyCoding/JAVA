package practice.advanced.collections;

import java.util.ArrayList;

public class OrderTracker {

    private ArrayList<String> orders = new ArrayList<>();

    public boolean addOrder(String orderId){
        if(orderId != null && !orderId.isEmpty()){
            orders.add(orderId);
            return true;
        }else{
            return false;
        }
    }

    public boolean cancelOrder(String orderId){
        return orders.remove(orderId);
    }

    public void cancelLast(){
        if(orders.isEmpty()){
            System.out.println("List is empty.");
        }else{
            orders.remove(orders.size()-1);
        }
    }

    public void cancelFirst(){
        if(orders.isEmpty()){
            System.out.println("List is empty.");
        }else{
            orders.remove(0);
        }
    }




}
