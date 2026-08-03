package practice.OOP.Inheritance;

public class VehTruck extends Vehicle{

    private int load;

    public VehTruck(String brand, int speed, int load){
        super(brand, speed);
        this.load = load;
    }

    public int getLoad(){
        return load;
    }

    public void setLoad(int load){
        this.load = load;
    }

    @Override
    public void move(){
        System.out.printf("%s truck on the move, load %d ton, speed %d km/h.%n",brand,load,speed);
    }

    @Override
    public void printInfo(){
        System.out.printf("brand: %s, speed: %d, load: %d.%n",brand,speed,load);
    }

    //Inheritance stop()

    public void unload(){
        load = 0;
        System.out.println("Zero load, unloading complete.");
    }
}
