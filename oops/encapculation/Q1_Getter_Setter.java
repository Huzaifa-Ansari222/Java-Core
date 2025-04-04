/*
demo of encapsulation
getter & setter ,private key
 */

package oops.encapculation;

// Main class to test encapsulation
public class Q1_Getter_Setter {
    public static void main(String[] args) {
        Person person1 = new Person("huzaifa", 25);

        // Using getter methods
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        // Using setter methods
        person1.setName("huzz");
        person1.setAge(24);

        System.out.println("Updated Name: " + person1.getName());
        System.out.println("Updated Age: " + person1.getAge());

        // Trying to set invalid age
//        person1.setAge(-5);
    }
}

class Person {
    private String name;  // Private variable (Encapsulation)
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Setting default age to 1.");
            this.age = 1;
        }
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Age must be greater than 0.");
        }
    }
}

