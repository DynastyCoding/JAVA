package practice.oop.polyabst;

public abstract class Transport {

    protected double distance;

    public Transport(double distance){
        setDistance(distance);
    }

    public double getDistance(){
        return distance;
    }

    public void setDistance(double distance){
        if(distance<0){
            this.distance = 0;
        }else{
            this.distance = distance;
        }
    }

    public abstract double calculateCost();

    public void printInfo(){
        System.out.printf("Distance %.1f KM, cost %.1f dollars.%n",distance,calculateCost());
    }
}
