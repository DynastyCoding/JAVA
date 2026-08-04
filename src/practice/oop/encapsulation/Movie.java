package practice.oop.encapsulation;

public class Movie {
    private String title;
    private String director;
    private double rating;
    private int reviews;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
        this.rating = 0.0;
        this.reviews = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public double getRating() {
        return rating;
    }

    public int getReviews() {
        return reviews;
    }

    public void rate(double score) {
        if (score >= 1.0 && score <= 5.0) {
            rating += score;
            reviews += 1;
        } else {
            System.out.println("Invalid range.");
        }
    }

    public double getAverageRating() {
        if (reviews == 0) {
            return 0.0;
        } else {
            return rating / reviews;
        }
    }

    public void printInfo() {
        System.out.println(title + " | " + director + " | " + getAverageRating() + " | " + reviews);
    }
}
