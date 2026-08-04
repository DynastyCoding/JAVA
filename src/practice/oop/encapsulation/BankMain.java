package practice.oop.encapsulation;

public class BankMain {

    public static void main(String[] args) {
        BankAccount account = new BankAccount( "A444","john", 5, 0.01);
        account.printInfo();

        account.deposit(3000);
        account.printInfo();

        account.withdraw(2000);
        account.printInfo();

        account.withdraw(5000);
        account.printInfo();
        account.applyInterest();
        account.printInfo();

    }


}
