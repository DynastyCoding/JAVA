package practice.oop.encapsulation;

public class BankAccount {
    private final String accountNumber;
    private String owner;
    private int balance;
    private double interestRate;

    public BankAccount(String accountNumber, String owner, int balance, double interestRate){

        if(accountNumber == null || accountNumber.isEmpty()){
            this.accountNumber = "UnknownHolder";
        }else{
            this.accountNumber = accountNumber;
        }

        setOwner(owner);

        if(balance<100){
            System.out.println("First deposit need to greater than 100.");
            this.balance = 100;
        }else{
            this.balance = balance;
        }

       setInterestRate(interestRate);
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public String getOwner(){
        return owner;
    }

    public int getBalance(){
        return balance;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public void setOwner(String owner){
        if(owner == null || owner.isEmpty()){
            this.owner = "UnknownUser";
        }else{
            this.owner = owner;
        }
    }

    public void setInterestRate(double interestRate){
        if(interestRate<0){
            System.out.println("Interest Rate must greater than 0.");
            this.interestRate = 0;
        }else{
            this.interestRate = interestRate;
        }
    }

    public void deposit(int amount){
        if(amount<=0) {
            System.out.println("Deposit amount must greater than 0.");
            return;
        }
        balance+=amount;
        System.out.printf("%s deposit %d, total balance is %d.%n",owner, amount, balance);
    }

    public void withdraw(int amount){
        if(amount<=0){
            System.out.println("withdraw amount must greater than 0.");
            return;
        }
        if(balance<amount){
            System.out.printf("Insufficient balance," +
                    " withdraw %d, balance %d.%n", amount, balance);
            return;
        }
        balance-=amount;
        System.out.printf("Withdraw successful, withdraw %d, balance %d.%n", amount, balance);
    }

    public void applyInterest(){
        double interest = balance*interestRate;
        balance+=interest;
        System.out.printf("Interest rate %f,interest %f,balance %d.%n", interestRate, interest,balance);
    }

    public void printInfo(){
        System.out.printf("account: %s | holder: %s | " +
                "balance: %d | interest rate: %f.%n",accountNumber, owner, balance, interestRate);
    }

}
