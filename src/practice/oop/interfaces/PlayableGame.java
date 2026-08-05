package practice.oop.interfaces;

public class PlayableGame implements Playable{

    private final String gameName;

    public PlayableGame(String gameName){
        this.gameName = (gameName == null || gameName.isEmpty())
                ? "Unknown game"
                : gameName;
    }

    public String getGameName(){
        return gameName;
    }

    @Override
    public void play(){
        System.out.println("Playing game: " + gameName);
    }

    public String getDeviceType(){
        return "Game Console";
    }
}
