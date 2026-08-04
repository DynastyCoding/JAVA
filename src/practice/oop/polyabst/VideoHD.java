package practice.oop.polyabst;

public class VideoHD extends Video{

    public VideoHD(String videoName, int duration){
        super(videoName, duration);
    }

    public String getMaxResolution(){
        return "1080p";
    }
}
