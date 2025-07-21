package oops.inheritance;

public class _6_DowncastingDemo {
    public static void main(String[] args) {
        // ✅ Upcasting first (Parent reference holding Child object)
        Parents p = new Childs();

        p.parentMoney(); // ✅ Works (Parent method)
        // p.childMoney(); ❌ Not accessible because reference type is Parents

        Childs c = (Childs) p;
        c.childMoney();         // ✅ Now we can access Child-specific method


    }
}

class Parents {
    public void parentMoney() {
        System.out.println("parent money");
    }
}

class Childs extends Parents {
    public void childMoney(){
        System.out.println("Child money");
    }
}