package oops.polymorphism.overloading;

public class Q5_Student_Constructor {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("huzaifa");
        Student student3 = new Student("huzaifa", 252);

        String[] courses = {"Math", "Physics", "Computer Science"};
        Student student4 = new Student("huzaifa",12, courses);//objct initalized if this obj ref method call

        student4.printInfo();
    }
}

    class Student {
        String name;
        int age;
        String [] course;

        // Default constructor
        Student() {
            System.out.println("Default Constructor Called");
        }

        // Constructor with only name
        Student(String name) {
            this.name = name;
            System.out.println("Name Constructor Called");
        }

        // Constructor with name and age
        Student(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("Name + Age Constructor Called");
        }

        // Constructor with name, age, and courses
        Student(String name, int age, String [] course) {
            this.name = name;
            this.age = age;
            this.course = course;
            System.out.println("Full Constructor Called");
        }

        void printInfo() {
            System.out.println("----------------------------------------");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            if (course != null) {
                System.out.print("Courses: ");
                for (String c : course) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
            System.out.println("----------------------------------------");
        }

    }
