package oops.constructors;

public class ConstructorDemo {
    String name;
    int age;

    ConstructorDemo(){
        this.name = "username";
        this.age = 00;
    }
    ConstructorDemo(String name, int age ){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        ConstructorDemo obj = new ConstructorDemo();
        ConstructorDemo obj2 = new ConstructorDemo("huzaifa", 23);

        System.out.println("before initialized value name:"+obj.name);
        System.out.println("before initialized value age:"+obj.age);

        obj.display();   // name: username age: 0
        obj2.display();  // name: huzaifa age: 23
    }

    void display(){
        System.out.println("name:"+name+" age:"+age);
    }
}
