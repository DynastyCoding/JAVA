package practice.oop.inheritance;

public class OrdMain {
    public static void main(String[] args) {

        Order gen = new Order(121, 3 , 500);
        OrdWholesale who = new OrdWholesale(221,50,300,0.15);
        OrdVip vip = new OrdVip(321, 2,1200,2);
        gen.printOrder();
        who.printOrder();
        vip.printOrder();

        System.out.println("Normal order total amount: " + gen.calculateTotal());
        System.out.println("Wholesale order total amount: " + who.calculateTotal());
        System.out.println("Vip order total amount: " + vip.calculateTotal());
    }
}
