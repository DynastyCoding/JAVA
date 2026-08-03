package practice.OOP.Inheritance;

public class OrdVip extends Order{

    private int vipLevel;

    public OrdVip(int orderId, int items, int unitPrice, int vipLevel) {
        super(orderId, items, unitPrice);
        this.vipLevel = vipLevel;
    }

    public int getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(int vipLevel) {
        this.vipLevel = vipLevel;
    }

    @Override
    public int calculateTotal(){
        switch(vipLevel){
            case 1:
                return (int)(items*unitPrice*0.9);

            case 2:
                return (int)(items*unitPrice*0.8);

            case 3:
                return (int)(items*unitPrice*0.7);

            default:
                return items*unitPrice;
        }
    }

    @Override
    public void printOrder(){
        System.out.printf("orderId: %d, items: %d, unitPrice: %d, vipLevel: %d.%n",orderId, items,unitPrice,vipLevel);

    }
}

