package practice.exception;

public class OrderMain {
    public static void main(String[] args) {
        OrderProcessor op = new OrderProcessor();

        op.parseQuantity("10");
        op.parseQuantity("abc");

        op.getOrderItem();

        op.getMemberName();

        op.calculateAverage();

        op.checkAge(25);

        try {
            op.checkAge(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
