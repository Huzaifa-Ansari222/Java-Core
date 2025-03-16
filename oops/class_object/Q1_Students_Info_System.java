/*
        Problem:
        Create a class Student with the following attributes:
        name (String)
        rollNumber (int)
        marks (double)

        Write methods to:
        Accept student details using a constructor.
        Display student details using a method displayInfo().
        Determine if the student has passed (pass if marks ≥ 40).

        Test Case:
        Student s1 = new Student("John", 101, 85.5);
        s1.displayInfo();
*/
package oops.class_object;

public class Q1_Students_Info_System {
    public static void main(String[] args) {

        //object creation
        Student student1 = new Student("Md Huzaifa Ansari", 79, 8.65);
        Student student2 = new Student("Md Hanjala Ansari", 78, 3.32);

        student1.displayInfo();
        student1.isPassed();

        System.out.println();
        student2.displayInfo();
        student2.isPassed();
    }
}

//student class
class  Student {
    String name;
    int rollNumber;
    double marks;

    //constructor of student details
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    //Display details of student
    void displayInfo() {
        System.out.println("Student Name:" + name);
        System.out.println("Roll Number" + rollNumber);
        System.out.println("Marks" + marks);
    }

    void isPassed() {
        if (marks >= 3.33) {
            System.out.println("Passed✅");
        } else {
            System.out.println("Fail❌");
        }
    }
}


/*
key note:
#Class & Object in Java
🔹 Class
-A class is a blueprint for creating objects.
-It defines properties (variables) and behaviors (methods) for objects.
🔹 Object
An object is an instance of a class.
Objects hold specific data and execute methods.

When to Use Static & Non-Static?
Feature	        |Static ✅                                        	| Non-Static ✅
-----------------------------------------------------------------------------------------------------------------------
Shared Data	|Yes                                                     |No (Each object has its own copy)
Memory           |Usage	Efficient (One copy for all)        |More (Each object has its copy)
Access	            |ClassName.method()                        	|object.method()
Example Use	|Constants, Utility methods, Counters	|Object properties, Instance behaviors

 */
