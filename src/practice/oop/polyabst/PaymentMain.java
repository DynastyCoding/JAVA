package practice.oop.polyabst;

public class PaymentMain {
    public static void main(String[] args) {
        Payment p1 = new PaymentCreditCard("T001",10000,"1234-2345-3456-4567");
        Payment p2 = new PaymentPayPal("T002",5000,"john@mail.com");

        Payment[] payments = {p1,p2};

        for (Payment p :payments){
            p.printDetails();
            p.printSummary();
            System.out.println();
        }

        System.out.println("Credit number: " + ((PaymentCreditCard) p1).getCardNumber());
        System.out.println("PayPal email: " + ((PaymentPayPal) p2).getEmail());
    }
}
