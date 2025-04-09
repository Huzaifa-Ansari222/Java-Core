package core_java.E_Constructors;
//Instance(object) Initialization BLock

public class I_I_B {
    I_I_B(){
        System.out.println("ho");// constructor not called first
    }
    {
        //initialize non static variable
        System.out.println("I am IIB 1"); // IIB called first before constructor
    }
    {
        System.out.println("I am IIB 2");
    }
    int x;
    {
        x = 200;// non static
    }
    public static void main(String[] args) {
        I_I_B obj = new I_I_B();// IIB called by making object
        I_I_B obj1 = new I_I_B();// IIB called 2nd time
        I_I_B obj2 = new I_I_B();
        System.out.println(obj2.x);// 2 IIB used to modified
    }
}
