package practice.oop.polyabst;

public class TransBike extends Transport{

    public TransBike(double distance){
        super(distance);
    }

    @Override
    public double calculateCost(){
        return distance*10;
    }
}
