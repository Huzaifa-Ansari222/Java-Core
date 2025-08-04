package oops.polymorphism.overloading;

public class Q2_Area_Cal {
    public static void main(String[] args) {
        area(4);
        area(3, 3);
        area(5);
    }

    public static double area(double radius) {
        double area =radius*radius;
        System.out.println("Area of circle "+area);
        return area;
    }

    public static int area(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of rectangle "+area);
        return area;
    }

    public static int area(int side) {
        int area = side * side;
        System.out.println("Area of square "+area);
        return area;
    }
}
