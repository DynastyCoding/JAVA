package practice.oop.polyabst;

public abstract class Payment {

    protected String transactionId;
    protected int amount;

    public Payment(String transactionId, int amount){
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public abstract int calculateFee();

    public abstract void printDetails();

    public void printSummary(){
        System.out.printf("transaction ID: %s, amount: %d," +
                          "Fee: %d, total amount: %d.%n",
                          transactionId, amount,calculateFee(),amount+calculateFee());
    }



}
