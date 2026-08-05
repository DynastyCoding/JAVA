package practice.oop.interfaces;

public class PlayableMain {
    public static void main(String[] args) {

        Playable[] devices = {
                new PlayableMusic("Bohemian Rhapsody"),
                new PlayableVideo("Inception"),
                new PlayableGame("The Legend of Zelda")
        };

        for(Playable d: devices){
            d.play();
            System.out.println("Device: " + d.getDeviceType());
            d.stop();
            System.out.println("Max Volume: " + Playable.MAX_VOLUME);
            System.out.println();
        }

    }
}
