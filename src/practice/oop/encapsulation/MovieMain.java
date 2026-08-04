package practice.oop.encapsulation;

public class MovieMain {
    public static void main(String[] args) {
        Movie m1 = new Movie("Inception", "Nolan");
        m1.printInfo();

        m1.rate(4.5);
        System.out.println(m1.getAverageRating());

        m1.rate(5.0);
        System.out.println(m1.getAverageRating());

        m1.rate(3.0);
        System.out.println(m1.getAverageRating());

        m1.rate(6.0);
        System.out.println(m1.getAverageRating());

        m1.printInfo();
    }
}
