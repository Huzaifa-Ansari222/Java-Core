package core_java.variables;

public class Variables {

    // 1. Static variable (class level/ global var)
    static int staticVar = 10;

    // 2. Non-static variable (instance level)
    int nonStatic = 20;

    public static void main(String[] args) {

        // 3. Local variable (defined inside a method & acess with in {} block)
        int localVar = 30;

        // 4. Reference variable (refers to an object)
        Variables obj = new Variables(); // reference variable

        System.out.println("Static Variable: " + staticVar);      // Accessing static directly
        System.out.println("Non-Static Variable: " + obj.nonStatic); // Accessing non-static via object
        System.out.println("Local Variable: " + localVar);        // Accessing local variable
        System.out.println("Reference Variable points to: " + obj); // Printing reference variable

    }

}
