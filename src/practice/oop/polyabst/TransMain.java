package practice.oop.polyabst;

public class TransMain {
    public static void main(String[] args) {
        Transport t1 = new TransBike(10);
        Transport t2 = new TransTruck(10);
        Transport t3 = new TransDrone(10);

        Transport[] transports = {t1, t2, t3};
        for(Transport t:transports){
            t.printInfo();
        }

        ((TransDrone) t3).chargeBattery();
    }
}
