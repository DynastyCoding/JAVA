package practice.OOP.Inheritance;

public class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand(){
        return brand;
    }

    public int getSpeed(){
        return speed;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void move(){
        System.out.printf("%s is driving, speed %d km/h.%n",brand, speed);
    }

    public void stop(){
        speed = 0;
        System.out.printf("%s speed has reached to zero, speed %d.%n",brand, speed);}

    public void printInfo(){
        System.out.printf("brand: %s, speed: %d.%n",brand, speed);
    }
}