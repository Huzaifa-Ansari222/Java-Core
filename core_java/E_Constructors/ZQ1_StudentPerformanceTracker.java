package core_java.E_Constructors;
public class ZQ1_StudentPerformanceTracker {
    class Student{
        String name;
        int rollNo;
        int [] marks = new int [5];
        float average;

        //constructor for student
        Student(String name, int rollNo, int[] marks){
            this.name =  name;
            this.rollNo = rollNo;
            this.marks = marks;
            //this.average = average;
            calculateAverage();
        }
        // Calculate average method
        public void calculateAverage() {
            int sum = 0;
            for (int mark : marks) {
                sum += mark;
            }
            this.average = sum / 5.0f;
        }
        //Display method
        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNo);
            System.out.print("Marks: ");
            for (int mark : marks) {
                System.out.print(mark + " ");
            }
            System.out.println("\nAverage: " + average);
        }

    }

    // Main
    public void main (String[] args){
        int [] marks = {43,56,76,32,53};
        Student obj1 = new Student ("Huzaifa", 79, marks);
        obj1.display();
    }
}



