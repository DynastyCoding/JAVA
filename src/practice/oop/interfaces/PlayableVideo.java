package practice.oop.interfaces;

public class PlayableVideo implements Playable{

    private final String movieTitle;

    public PlayableVideo(String movieTitle){
        this.movieTitle = (movieTitle == null || movieTitle.isEmpty())
                ? "Unknown Movie"
                : movieTitle;
    }

    public String getMovieTitle(){
        return movieTitle;
    }

    @Override
    public void play(){
        System.out.println("Playing movie: " + movieTitle);
    }

    @Override
    public String getDeviceType(){
        return "Video player";
    }
}
