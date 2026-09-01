package practice.exception;

public class OrderServiceMain {
    public static void main(String[] args) {
        OrderService service = new OrderService();

        // 1. findOrder
        System.out.println(service.findOrder("ORD001"));
        try {
            service.findOrder("ORD002");
        } catch (OrderNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // 2. checkout
        System.out.println(service.checkout(10, 5));
        try {
            service.checkout(10, 15);
        } catch (InsufficientStockException e) {
            System.out.println(e.getMessage());
        }

        // 3. pay
        System.out.println(service.pay("ORD001"));
        try {
            service.pay("ORD999");
        } catch (InvalidPaymentException e) {
            System.out.println(e.getMessage());
        }

        // 4. cancelOrder
        System.out.println(service.cancelOrder("ORD001"));
        try {
            service.cancelOrder("ORD002");
        } catch (OrderAlreadyShippedException e) {
            System.out.println(e.getMessage());
        }

        // 5. addToCart
        System.out.println(service.addToCart("P001"));
        try {
            service.addToCart("P002");
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}