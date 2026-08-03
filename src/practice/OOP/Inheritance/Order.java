package practice.OOP.Inheritance;

public class Order {

    protected int orderId;
    protected int items;
    protected int unitPrice;

    public Order(int orderId, int items, int unitPrice) {
        this.orderId = orderId;
        this.items = items;
        this.unitPrice = unitPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int calculateTotal(){
        return items*unitPrice;
    }

    public void printOrder(){
        System.out.printf("orderId: %d, items: %d, unitPrice: %d.%n",orderId, items,unitPrice);
    }
}

