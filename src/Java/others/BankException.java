package Java.others;

class NotEnoughException extends Exception {

    private int shortAmount;

    NotEnoughException(int shortAmount) {
        super("Insufficient balance");
        this.shortAmount = shortAmount;
    }

    public int getShortAmount() {
        return shortAmount;
    }
}

class MyBank {
    private int balance;

    MyBank(int initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(int amount) {

        balance += amount;
        System.out.printf("deposit: %d dollars, total balance: %d dollars.%n", amount, balance);
    }

    public void withdraw(int cashout) throws NotEnoughException {
        if (cashout > balance) {
            int shortAmount = cashout - balance;

        }

    }

}


public class BankException {
    public static void main(String[] args) {

    }
}

