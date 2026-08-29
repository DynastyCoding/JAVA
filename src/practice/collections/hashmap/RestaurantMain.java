package practice.collections.hashmap;

public class RestaurantMain {
    public static void main(String[] args) {
        RestaurantMenu rm = new RestaurantMenu();

        rm.addDish("Beef Noodles", 120);
        rm.addDish("Chicken Rice", 100);
        rm.addDish("Bubble Tea", 50);
        rm.addDish("Bubble Tea", 60);

        rm.updatePrice("Bubble Tea", 60);

        rm.getPrice("Bubble Tea");

        rm.getPrice("Fried Rice");

        rm.removeDish("Bubble Tea");

        rm.getTotalDishes();

        rm.printMenu();

    }
}
