package core_java.E_Constructors;

public class This_Keyword {
    int x = 10;
    public static void main(String[] args) {
        This_Keyword obj = new This_Keyword();
        System.out.println(obj); //print address of obj
        obj.test(); //nonstatic method which print obj address

        //access with this key word
        System.out.println("method passed modified: "+obj.x);

        obj.test3();

        //this key word cant be used in static method
        //can be used in non static and constructor


        //this place holder
        This_Keyword obj1 = new This_Keyword();
        System.out.println("1st obj add: ");
        obj.testt();
        System.out.println("2nd obj add: ");
        obj1.testt();
    }

    public void testt() {
        System.out.println(this);//single this print 2 diffrent obj address power of this keyword
    }

    public void test (){
        System.out.println(this);//address
        System.out.println(this.x);
        this.x =100;
    }
    public void test2 (){
        System.out.println("hi");
    }
    public void test3 (){
        this.test2();
    }

}
