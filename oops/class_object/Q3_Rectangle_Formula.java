/*
3. Rectangle Area Calculator
Problem:
Create a class Rectangle with attributes:
length (double)
width (double)

Methods:
A constructor to initialize values.
calculateArea() – Returns the area.
calculatePerimeter() – Returns the perimeter.

Test Case:
Rectangle rect = new Rectangle(5.0, 3.0);
System.out.println("Area: " + rect.calculateArea());
System.out.println("Perimeter: " + rect.calculatePerimeter());
 */
package oops.class_object;

public class Q3_Rectangle_Formula {
    public static void main(String[] args) {
        // Creating an object with length=5.0 and width=3.0
        Rectangle rect = new Rectangle(5.0, 3.0);

        // Calling methods that use instance variables
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}

    class Rectangle {
        double length;
        double width;

        // Constructor to initialize the attributes
        Rectangle(double length, double width){
            // Stores values in instance variables
            this.length = length;
            this.width = width;
        }
//        double calculateArea(double length, double width) {  // ❌ New variables, ignoring instance ones
//        Here, length and width inside the method are new local variables, not the instance variables.
//        This means that the method ignores the object's actual length and width and instead relies on what is passed to it (which was incorrect in your main method).
//        Uses instance variables directly, no need for parameters
//        Constructor Already Stores Values
//        Instance Variables are Accessible in Methods

        double calculateArea(){ // ✅ Uses instance variables directly
            System.out.println(""+length+", "+width); // hence proved method can access variable value : no need to pass in parameter
            return length * width;
        }
        double calculatePerimeter(){ // ✅ Uses instance variables directly
            return  2 * (length + width);
        }
    }
