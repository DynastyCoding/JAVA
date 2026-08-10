package practice.advanced.collections.ArrayList;

import java.util.ArrayList;

public class RestaurantReservation {

    private ArrayList<String> reservations = new ArrayList<>();

    public boolean addReservation(String name){
        if( name == null || name.isEmpty()){
            return false;
        }else{
            reservations.add(name);
            return true;
        }
    }

    public boolean cancelReservation(String name){
        return reservations.remove(name);
    }

    public void cancelLast(){
        if(reservations.isEmpty()){
            System.out.println("List is empty.");
        }else{
            reservations.remove(reservations.size()-1);
        }
    }

    public boolean hasReservation(String name){
        return reservations.contains(name);
    }

    public int getTotalReservations(){
        return reservations.size();
    }

    public void printAll(){
        if(reservations.isEmpty()){
            System.out.println("No reservations");
        }else{
            for (int i = 0; i < reservations.size(); i++) {
                System.out.println(reservations.get(i));
            }
        }
    }

    public static void main(String[] args) {

        RestaurantReservation restaurant = new RestaurantReservation();

        restaurant.addReservation("1. 王小明");
        restaurant.addReservation("2. 陳大華");
        restaurant.addReservation("3. 李小美");
        restaurant.addReservation("4. 張小安");
        restaurant.printAll();

        restaurant.cancelReservation("2. 陳大華");
        System.out.println("=== After cancel===");
        restaurant.printAll();

        System.out.println("=== Cancel Last ===");
        restaurant.cancelLast();
        restaurant.printAll();

        System.out.println("Total reservations: " + restaurant.getTotalReservations());

    }
}
