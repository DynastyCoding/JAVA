package practice.oop.polyabst;

public class PaymentPayPal extends Payment{
    private String email;

    public PaymentPayPal(String transactionId, int amount, String email){
        super(transactionId, amount);
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public int calculateFee(){
        return (int)(amount*0.03);
    }

    @Override
    public void printDetails(){
        System.out.printf("PayPal | email: %s | amount: %d | hand fee: %d.%n",email,amount,calculateFee());
    }
}
