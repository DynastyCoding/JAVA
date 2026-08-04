package practice.oop.polyabst;

public class ItemMain {
    public static void main(String[] args) {
        Item frag = new ItemFragile("Vase",2.5,4);
        Item elect = new ItemElectronics("Laptop",3.0,true);

        Item[] items = {frag, elect};

        for(Item p: items){
            p.printLabel();
            p.pack();
            System.out.println();
        }

        ((ItemFragile) frag).specialHandling();
        System.out.printf("Battery included: %b.",((ItemElectronics) elect).getBatteryIncluded());

    }
}
