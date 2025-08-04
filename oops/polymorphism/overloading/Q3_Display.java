package oops.polymorphism.overloading;

public class Q3_Display {
    public static void main(String[] args) {
        display("huzaifa");
        display("huzaifa", 4);
        display("huzaifa", 14, "banglore");
    }

    public static void display(String name) {
        System.out.println(name);
    }
    public static void display(String name, int age) {
        System.out.println(name+" "+age);
    }
    public static void display(String name, int age, String city) {
        System.out.println(name+" "+age+" "+city);
    }
}
