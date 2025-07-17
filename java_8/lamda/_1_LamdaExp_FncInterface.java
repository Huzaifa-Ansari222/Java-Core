//A lambda expression is a shortcut for creating an implementation of that interface.
package java_8.lamda;

public class _1_LamdaExp_FncInterface {
    public static void main(String[] args) {
//        it creates an object, but of an anonymous class implementing Greeting.
//        actual object is a hidden anonymous class
//        InterfaceName refVariableName = (args) -> body
        Greeting greet = (name) -> { //object made greet and dataType Greeting interface / used no name class
            System.out.println("Hello, " + name);
        };
        // Call the method
        greet.sayHello("Huzaifa");
        greet.sayHello("Hanjala");

    }
}
@FunctionalInterface
interface Greeting {
    void sayHello(String name);//method is abstract in interface by default
//    void dhd(int x);
}

//👉 In one line:
//        Lambda is a shortcut for making an anonymous class that implements a single-method interface and executes its code.
//@FuntionalInterface
//()->{} lamda expression


/* before java 8
package java_8.lamda;

public class _1_Lamda_demo {
    public static void main(String[] args) {
        // Anonymous inner class implementing Greeting interface
        Greeting greet = new Greeting() { //no name class
            @Override
            public void sayHello(String name) {
                System.out.println("Hello, " + name);
            }
        };

        // Call the method
        greet.sayHello("Huzaifa");
        greet.sayHello("Java");
    }
}

// Functional interface
interface Greeting {
    void sayHello(String name);
}
*/
