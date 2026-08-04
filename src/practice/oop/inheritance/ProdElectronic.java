package practice.oop.inheritance;

public class ProdElectronic extends Product{
    private int warranty;

    public ProdElectronic(int id, String name, int price, int warranty){
        super(id, name, price);
        this.warranty = warranty;
    }

    public int getWarranty(){
        return warranty;
    }

    public void setWarranty(int warranty){
        this.warranty = warranty;
    }

    @Override
    public int getDiscount(){
        return (int)(price*0.85);
    }

    @Override
    public void printInfo(){
        System.out.printf("id: %d, name: %s, price: %d, warranty: %d month.%n",id, name,price,warranty);
    }

    public void printWarranty(){
        System.out.printf("Warranty %d month.%n", warranty);
    }


}
