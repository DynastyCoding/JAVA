package Java.oop;

interface Phone{
    void call();
}
interface Camera{
    void takePhone();
}
interface SmartDevice extends Phone, Camera{
    void connectWifi();
}

class Tablet implements SmartDevice{

    public void call(){
        System.out.println("Tablet: call");
    }

    public void takePhone(){
        System.out.println("Tablet: take phone");
    }

    public void connectWifi(){
        System.out.println("Tablet: connect wifi");
    }
}

public class SmartDeviceInterface {
    public static void main(String[] args) {

        Tablet tablet = new Tablet();
        tablet.call();
        tablet.takePhone();
        tablet.connectWifi();
    }
}
