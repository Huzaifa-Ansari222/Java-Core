package oops.inheritance;

public class Q1_Smart_Home_System {
    public static void main(String[] args) {
        SmartDevice remote = new SmartDevice();
        remote.turnOnLight();
        remote.turnOffLight();
        remote.setTemperature(18);
    }
}

//TASK 1 Light controller interface
interface LightController {
    public void turnOnLight();
    public void turnOffLight();
}

//TASK 2 Temperature controller interface
interface TemperatureController {
    public void setTemperature(int temp);
}

//Cannot make a top-level class private or protected
class SmartDevice implements LightController, TemperatureController { //only 1 public top level class allow per 'file'

    @Override
    public void turnOnLight(){
        System.out.println("light On");
    }

    @Override
    public void turnOffLight() {
        System.out.println("light off");
    }

    @Override
    public void setTemperature(int temp){
        System.out.println(temp);
    }
}