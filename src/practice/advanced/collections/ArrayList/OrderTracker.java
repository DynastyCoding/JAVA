package practice.advanced.collections.ArrayList;

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

    public String getOrder(int index){
        if(index<0 || index >= orders.size()){
            return null;
        }else{
            return orders.get(index);
        }
    }

    public int getTotal(){
        return orders.size();
    }

    public boolean hasOrder(String orderId){
        return orders.contains(orderId);
    }

    public void printAll(){
        if(orders.isEmpty()){
            System.out.println("No book");
        }else{
            for(int i=0; i<orders.size(); i++){
                System.out.println((i + 1) + ". " + orders.get(i));
            }
        }
    }

    public void printLatest(int n){
        if(n<=0 || n>=orders.size()){
            printAll();
        }else{
            int start = orders.size()-n;
            for(int  i=start; i<orders.size(); i++){
                System.out.println((i-start + 1) + ". " + orders.get(i));
            }
        }
    }

    public void clear(){
        orders.clear();
    }

    public static void main(String[] args) {
        OrderTracker tracker = new OrderTracker();

        tracker.addOrder("ORD-001");
        tracker.addOrder("ORD-002");
        tracker.addOrder("ORD-003");
        tracker.addOrder("ORD-004");
        tracker.addOrder("ORD-005");

        System.out.println("=== Cancel ORD-003 ===");
        tracker.cancelOrder("ORD-003");
        tracker.printAll();

        System.out.println("=== Cancel last order ===");
        tracker.cancelLast();
        tracker.printAll();

        System.out.println("=== Cancel first order ===");
        tracker.cancelFirst();
        tracker.printAll();

        System.out.println("=== Check the last new order ===");
        tracker.printLatest(2);

        System.out.println("=== Check is ORD-002 exist ===");
        System.out.println(tracker.hasOrder("ORD-002"));

        System.out.println("Total orders: " + tracker.getTotal());

    }
}