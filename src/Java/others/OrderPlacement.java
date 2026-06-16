package Java.others;

public class OrderPlacement {

    static OrderStatus placeOrder(int stock, int amount) {
        if (amount <= 0) {
            return OrderStatus.INVALID_AMOUNT;
        } else if (amount > stock) {
            return OrderStatus.OUT_OF_STOCK;
        } else {
            return OrderStatus.SUCCESS;
        }
    }

    public static void main(String[] args) {

        int[][] orders = {{10, 0}, {10, 20}, {10, 5}};
        for (int[] order : orders) {
            int stock = order[0];
            int amount = order[1];
            OrderStatus result = placeOrder(stock, amount);
            System.out.println("stocks: " + stock + ", book: " + amount
                    + " -> [" + result.getCode() + "]" + result.getMessage());
        }
    }
}
