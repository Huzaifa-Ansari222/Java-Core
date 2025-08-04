package oops.polymorphism.overloading;

public class Q1_Add_Two {
    public static void main(String[] args) {
        System.out.println(add(5, 4));
        System.out.println(add(2.3,42.4));
        System.out.println(add(2,4.4));
        System.out.println(add(2.2,4));



    }

    public static int add(int a, int b) {
        int sum = a +b;
        return sum;
    }
    public static double add(double a, double b) {
        double sum = a +b;
        return sum;
    }
    public static double add(int a, double b) {
        double sum = a +b;
        return sum; // or cast to  int / return (int) sum
//        return (int) sum; // Explicit cast to int / give int value
    }
    public static double add(double a, int b) {
        double sum = a +b;
        return sum; // or cast to  int / return (int) sum
//        return (int) sum; // Explicit cast to int / give int value
    }
}
