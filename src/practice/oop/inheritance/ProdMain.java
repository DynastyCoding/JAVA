package practice.oop.inheritance;

public class ProdMain {

    public static void main(String[] args) {
        Product nb = new Product(011,"notebook", 100);
        ProdElectronic cp = new ProdElectronic(411, "cellphone", 17000, 24);

        nb.printInfo();
        cp.printInfo();

        System.out.println(nb.getDiscount());
        System.out.println(cp.getDiscount());
        cp.printWarranty();

    }
}
