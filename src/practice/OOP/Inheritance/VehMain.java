package practice.OOP.Inheritance;

public class VehMain {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Toyota", 60);
        VehTruck t = new VehTruck("Volvo", 40,5);

        v.move();
        t.move();

        v.stop();
        t.stop();

        t.unload();

        t.printInfo();
        v.printInfo();
    }
}
