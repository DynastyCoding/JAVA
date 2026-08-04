package practice.oop.polyabst;

public class VideoStandard extends Video{

    public VideoStandard(String videoName, int duration){
        super(videoName, duration);
    }

    public String getMaxResolution(){
        return "720p";
    }
}
