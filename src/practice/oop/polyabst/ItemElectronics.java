package practice.oop.polyabst;

public class ItemElectronics extends Item{

    private boolean batteryIncluded;

    public ItemElectronics(String name, double weight, boolean batteryIncluded){
        super(name, weight);
        setBatteryIncluded(batteryIncluded);
    }

    public boolean getBatteryIncluded(){
        return batteryIncluded;
    }

    public void setBatteryIncluded(boolean batteryIncluded){
        this.batteryIncluded = batteryIncluded;
    }

    public void pack(){
        System.out.printf("Packing %s in anti-static bag. Battery: %b.%n",name,batteryIncluded);
    }
}
