package practice.oop.polyabst;

public class PaymentCreditCard extends Payment {

    private String cardNumber;

    public PaymentCreditCard(String transactionId, int amount, String cardNumber){
        super(transactionId, amount);
        this.cardNumber = cardNumber;
    }

    public String getCardNumber(){
        return cardNumber;
    }

    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public int calculateFee(){
        return (int)(amount*0.02);
    }

    @Override
    public void printDetails(){
        System.out.printf("Credit card | card numbers: %s | " +
                          "amount: %d, hand fee: %d.%n",cardNumber,amount,calculateFee());
    }
}
