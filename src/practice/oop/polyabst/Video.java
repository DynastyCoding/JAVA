package practice.oop.polyabst;

public abstract class Video {
    protected String videoName;
    protected int duration;

    public Video(String videoName, int duration){
        setVideoName(videoName);
        setDuration(duration);
    }

    public String getVideoName(){
        return videoName;
    }

    public int getDuration(){
        return duration;
    }

    public void setVideoName(String videoName){
        if(videoName == null || videoName.isEmpty()){
            this.videoName = "Untitled";
        }else{
            this.videoName = videoName;
        }
    }

    public void setDuration(int duration){
        if(duration<=0){
            this.duration = 1;
        }else{
            this.duration = duration;
        }
    }

    public abstract String getMaxResolution();

    public void play(){
        System.out.printf("Now playing: %s (%d min), resolution: %s.%n", videoName, duration, getMaxResolution());
    }
}
