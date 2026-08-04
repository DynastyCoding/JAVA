package practice.oop.encapsulation;

public class TemperatureMain {
    public static void main(String[] args) {
        Temperature t1 = new Temperature("Taipei", 35);
        t1.printInfo();

        System.out.println("°F = " + t1.toFahrenheit());
        System.out.println("Is hot?: " + t1.isHot());

        t1.setTemp(-60);
        t1.printInfo();

        t1.setTemp(25);
        t1.printInfo();

        System.out.println("Is hot?: " + t1.isHot());

    }
}
