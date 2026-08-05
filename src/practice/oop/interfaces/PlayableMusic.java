package practice.oop.interfaces;

public class PlayableMusic implements Playable{

    private final String songTitle;

    public PlayableMusic(String songTitle){
        this.songTitle = (songTitle == null || songTitle.isEmpty())
                ? "Unknown Song"
                : songTitle;
    }

    public String getSongTitle(){
        return songTitle;
    }

    @Override
    public void play(){
        System.out.println("Playing song: " + songTitle);
    }

    @Override
    public String getDeviceType(){
        return "Music Player";
    }
}
