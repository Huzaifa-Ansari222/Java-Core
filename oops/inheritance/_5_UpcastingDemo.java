package oops.inheritance;

public class _5_UpcastingDemo {
    public static void main(String[] args) {
        Parent p = new Child(); //parent ref  from  child object class
        p.parentMoney(); // ✅ Calls Child's overridden method (runtime polymorphism)
//        p.childMoney();// ❌ Not allowed - Parent reference can't access Child-specific methods
    }
}

class Parent{
        public void parentMoney(){//static method doesnot make sense here
            System.out.println("Accessing parent money");
        }
    }

class Child extends Parent {
        @Override
        public void parentMoney(){ //overriding
            System.out.println("Accessing child money via overriding");
        }
        public void childMoney(){
            System.out.println("Accessing child-specific money");
        }
    }
/*
Why upcasting doesn’t make sense with static?
Static methods are called based on the reference type, not the actual object.
Upcasting is meaningful only for instance (non-static) methods where runtime polymorphism (method overriding) happens.
Static methods are always compile-time resolved, so they behave the same regardless of whether you upcast or not.
 */