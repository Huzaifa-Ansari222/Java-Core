// Note: Class = Blueprint | Object = Instance

package core_java.A_Class_Object;

public class BasicClass {
    public static void main(String[] args) {
        // Create object to access non static variables
        Car myCarObj = new Car();
        myCarObj.color = "Red";  // Set instance var
        System.out.println("Car color: "+ myCarObj.color);

        // Access static var (ClassName.staticVar)
        System.out.println("Wheels: " + Car.wheels); // 4


    }
}
class Car {
    // Non-static (instance variable)
    String color;

    // Static (class variable)
    static int wheels = 4;
}
