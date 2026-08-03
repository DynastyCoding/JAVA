package practice.OOP.Inheritance;

public class OrdWholesale extends Order{
    private double discountRate;

    public OrdWholesale(int orderId, int items, int unitPrice, double discountRate){
        super(orderId, items, unitPrice);
        this.discountRate = discountRate;
    }

    public double getDiscountRate(){
        return discountRate;
    }

    public void setDiscountRate(double discountRate){
        this.discountRate = discountRate;
    }

    @Override
    public int calculateTotal(){
        return (int)(items*unitPrice*(1-discountRate));
    }

    @Override
    public void printOrder(){
        System.out.printf("orderId: %d, items: %d, unit price: %d, discount rate: %f.%n",orderId, items,unitPrice,discountRate);
    }
}
