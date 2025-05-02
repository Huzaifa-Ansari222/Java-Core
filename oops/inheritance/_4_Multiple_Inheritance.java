package oops.inheritance;

public class _4_Multiple_Inheritance {

}
interface Camera {
    void takePhoto(); //imComplete method
    void recordVideo();
}

interface MusicPlayer {
    void playMusic();
    void stopMusic();
}
class SmartPhone implements Camera,MusicPlayer{
    public void takePhoto() {
        System.out.println("Photo taken!");
    }

    public void recordVideo() {
        System.out.println("Recording video...");
    }

    public void playMusic() {
        System.out.println("Playing music...");
    }

    public void stopMusic() {
        System.out.println("Music stopped.");
    }
}