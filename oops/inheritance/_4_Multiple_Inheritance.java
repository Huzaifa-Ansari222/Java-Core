package oops.inheritance;

public class _4_Multiple_Inheritance {
// Multiple inheritance using interface
}
interface Camera {
    void takePhoto(); //imComplete method
    void recordVideo(); //incomplete method
}

interface MusicPlayer {
    void playMusic(); //incomplete method
    void stopMusic(); //incomplete method
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