package practice.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MovieRating {

    private Map<String, Double> ratings = new HashMap<>();

    public boolean addOrUpdateRating(String movie, double rating){
        if(movie == null || movie.isEmpty()){
            return false;
        }else if(rating <0.0 || rating >10.0){
            return false;
        }else{
            ratings.put(movie, rating);
            return true;
        }
    }

    public double getRating(String movie){
        if(ratings.containsKey(movie)){
            return ratings.get(movie);
        }else{
            return -1;
        }
    }

    public boolean removeMovie(String movie){
        if(ratings.containsKey(movie)){
            ratings.remove(movie);
            return true;
        }else{
            return false;
        }
    }

    public void printAllRatings(){
        if(ratings.isEmpty()){
            System.out.println("No movies.");
        }else{
            for(String movie: ratings.keySet()){
                System.out.println(movie + "->" + ratings.get(movie));
            }
        }
    }

}
