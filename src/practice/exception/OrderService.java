package practice.exception;

public class OrderService {

    public String findOrder(String orderId){
        if(!orderId.equals("ORD001")){
            throw new OrderNotFoundException("Order not found.");
        }
        return "Order found.";
    }

    public boolean checkout(int stock, int quantity){
        if(quantity>stock){
            throw new InsufficientStockException("Insufficient stock.");
        }
        return true;
    }

    public boolean pay(String orderId){
        if(orderId.equals("ORD999")){
            throw new InvalidPaymentException("Payment failed.");
        }
        return true;
    }
    public boolean cancelOrder(String orderId){
        if(orderId.equals("ORD002")){
            throw new OrderAlreadyShippedException("Order already shipped.");
        }
        return true;
    }

    public boolean addToCart(String productId){
        if(!productId.equals("P001")){
            throw new ProductNotFoundException("Product not found.");
        }
        return true;
    }

}
