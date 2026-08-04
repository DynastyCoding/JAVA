package practice.oop.polyabst;

public class VideoPremium extends Video{

    public double networkSpeed;

    public VideoPremium(String videoName, int duration, double networkSpeed){
        super(videoName, duration);
        setNetworkSpeed(networkSpeed);
    }

    public double getNetworkSpeed(){
        return networkSpeed;
    }

    public void setNetworkSpeed(double networkSpeed){
        if(networkSpeed<0){
            this.networkSpeed = 0;
        }else{
            this.networkSpeed = networkSpeed;
        }
    }

    public String getMaxResolution(){
        if(networkSpeed>=50){
            return "4K";
        }else if(networkSpeed>=25){
            return "1080p";
        }else if(networkSpeed>=10){
            return "720p";
        }else{
            return "480p";
        }
    }

    public void checkNetworkStatus(){
        System.out.printf("Current network speed: %.1f Mbps.",networkSpeed);
    }
}
