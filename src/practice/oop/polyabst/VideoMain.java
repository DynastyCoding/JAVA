package practice.oop.polyabst;

public class VideoMain {
    public static void main(String[] args) {
        Video v1 = new VideoStandard("Avatar", 120);
        Video v2 = new VideoHD("Oppenheimer", 180);
        Video v3 = new VideoPremium("Dune", 155, 30);

        Video[] videos = {v1, v2, v3};
        for(Video p:videos){
            p.play();
        }

        if(v3 instanceof VideoPremium){
            ((VideoPremium) v3).checkNetworkStatus();

        }
    }
}
