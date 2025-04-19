package oops.inheritance;

public class _0_Single_Level {
//    Single level inheritance
//    Developer -> Employee  /📌 Subclass -> Superclass
//    [Developer] ---▷ [Employee]  /uml
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
