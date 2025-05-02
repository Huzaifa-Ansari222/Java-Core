package oops.polymorphism.overloading;

public class _0Overloading {
    // Method 1: no parameters
    void show() {
        System.out.println("No parameters");
    }

    // Method 2: one int parameter
    void show(int a) {
        System.out.println("Integer: " + a);
    }

    // Method 3: two int parameters
    void show(int a, int b) {
        System.out.println("Two integers: " + a + ", " + b);
    }

    // Method 4: one double parameter
    void show(double d) {
        System.out.println("Double: " + d);
    }

    public static void main(String[] args) {
        _0Overloading obj = new _0Overloading();

        obj.show();           // Output: No parameters
        obj.show(10);         // Output: Integer: 10
        obj.show(10, 20);     // Output: Two integers: 10, 20
        obj.show(3.14);       // Output: Double: 3.14
    }
}
