package practice.oop.polyabst;

public class TransTruck extends Transport{

    public TransTruck(double distance){
        super(distance);
    }

    @Override
    public double calculateCost(){
        return distance*25;
    }
}
