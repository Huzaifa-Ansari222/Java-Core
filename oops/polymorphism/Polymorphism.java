package oops.polymorphism;

public class Polymorphism {

}
class Parent {
    int x = 10;
    void parentMethod() {
        System.out.println("parent things");
    }
}
class Child extends Parent {
    @Override
    void parentMethod() {
        System.out.println("same method modified by polymorphism using inherit");
    }

    public static void main(String[] args) {

        Child childObj = new Child();
        // ✅ access / Child <-- Child(object)
        // Normal object creation. Full access to both Parent and Child members.

        Parent childObj2 = new Parent();
        // ✅ access / Parent <-- Parent(object)
        // Standard object creation. No polymorphism here.

        // ❌ Compile-time error:
        // Child childObj3 = new Parent();
        // ❌ down casting / Child <-- Parent(object)
        // Invalid because a Parent object is not necessarily a Child.

        // ✅ Key concept of runtime polymorphism:
        Parent childObj1 = new Child();
        // ✅ access /Upcasting to Parent / Parent <-- Child(object)
        // Legal and correct. This is polymorphism.

        childObj1.parentMethod(); // Output: "child things"

    }
}

/*
🔑 Summary Table
Code	                |   When to Use                                	| Access |Polymorphism
-----------------------------------------------------------------------------------------------
Child c = new Child();  |	When you want full Child access	            |Full    |❌
Parent p = new Parent();|	When only Parent functionality is needed    |Parent	 |❌
Child c = new Parent(); |	❌ Never — illegal	                        | ❌     |	❌
Parent p = new Child(); |	When using runtime polymorphism             |Parent  |	✅

 */