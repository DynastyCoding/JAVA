package practice.oop.polyabst;

public class TransDrone extends Transport{

    public TransDrone(double distance){
        super(distance);
    }

    @Override
    public double calculateCost(){
        return distance*40;
    }

    public void chargeBattery(){
        System.out.println("Drone charging...");
    }
}
