package oops.inheritance;

public class _1_Single_Level {
//    Single level inheritance
//    Developer -> Employee  /📌 Subclass -> Superclass
}
class Employee{
    String name = "Huzaifa" ;
    void work() {
        System.out.println("employee is working...");
    }
}
class Developer extends Employee {
    void code() {
        System.out.println("developer is writing code");
    }

    public static void main(String[] args) {
        Developer devObj = new Developer();
        devObj.work();
        System.out.println(devObj.name);
    }
}
