package core_java.D_Methods;

public class MethodDemo {
    // Main method
    public static void main(String[] args) {
        MethodDemo obj = new MethodDemo(); //becaasue they are none static method

        int sum = obj.add(10, 20);
        System.out.println("Sum: " + sum);

        obj.greet("Huzaifa");

        String msg = obj.getMessage();
        System.out.println("Message: " + msg);

        obj.printLine();

        // Static method call
        staticHello(); // same class, can call directly because its static method
        // or MethodDemo.staticHello();

        // Method overloading
        int intProduct = obj.multiply(4, 5);
        double doubleProduct = obj.multiply(4.5, 3.2);
        System.out.println("Int Product: " + intProduct);
        System.out.println("Double Product: " + doubleProduct);
    }
    // 1. With arguments and return
    public int add(int a, int b) {
        return a + b;
    }

    // 2. With arguments, no return
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // 3. No arguments, with return
    public String getMessage() {
        return "Welcome to Java!";
    }

    // 4. No arguments, no return
    public void printLine() {
        System.out.println("---------------");
    }

    // 5. Static method
    public static void staticHello() {
        System.out.println("This is a static method.");
    }

    // 6. Method overloading
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

}
