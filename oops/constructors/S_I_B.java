package oops.constructors;

public class S_I_B {
    static { // run before Main method / no need to make object / auto execute
        System.out.println("SIB");
    }
    static { // execute in sequence if more than one SIB
        System.out.println("SIB twin");
    }

    public static void main(String[] args) {
        System.out.println("Main");
    }
}
