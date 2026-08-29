package practice.collections.hashmap;

public class MovieMain {
    public static void main(String[] args) {
        MovieRating system = new MovieRating();

        System.out.println(system.addOrUpdateRating("Inception", 9.2));  // true
        System.out.println(system.addOrUpdateRating("Interstellar", 8.6)); // true
        System.out.println(system.addOrUpdateRating("Tenet", 7.5));        // true
        System.out.println(system.addOrUpdateRating("", 5.0));             // false
        System.out.println(system.addOrUpdateRating("Oppenheimer", 11.0)); // false

        system.printAllRatings();

        System.out.println("Inception rating: " + system.getRating("Inception"));  // 9.2
        System.out.println("Dunkirk rating: " + system.getRating("Dunkirk"));      // -1

        System.out.println("Remove Tenet: " + system.removeMovie("Tenet"));        // true
        System.out.println("Remove Dunkirk: " + system.removeMovie("Dunkirk"));    // false

        system.printAllRatings();
    }
}
