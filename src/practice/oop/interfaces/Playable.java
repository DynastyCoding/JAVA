package practice.oop.interfaces;

public interface Playable {

    int MAX_VOLUME = 100;

    void play();

    String getDeviceType();

    default void stop(){
        System.out.println("Stopping playback...");
    }
}
