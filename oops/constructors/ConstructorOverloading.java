package oops.constructors;

//constructor overloading
public class ConstructorOverloading {
    //constructor
    //no return data type / not even void
    ConstructorOverloading(){ //no of args 0
        System.out.println("hi");
    }
    ConstructorOverloading(int x){ //no of args 1
        System.out.println(x);
    }
    ConstructorOverloading(double x){ //no of args 1 but data types is different
        System.out.println(x);
    }
    ConstructorOverloading(int x, int y){ // not of args 2
        System.out.println(x);
        System.out.println(y);
    }
    ConstructorOverloading(int x, int y, int z){ // not of args 2 & data types 2
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    ConstructorOverloading(int x, char y){
        System.out.println(x);
        System.out.println(y);
    }
    //psvm
    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading(); //call constructor on 0 args
        ConstructorOverloading obj2 = new ConstructorOverloading(10); //call constructor on 1 args
        ConstructorOverloading obj22 = new ConstructorOverloading(10.9); //call constructor on 1 args
        ConstructorOverloading obj3 = new ConstructorOverloading(100,20); //call constructor on 2 args
        ConstructorOverloading obj4 = new ConstructorOverloading(1000,200,30); //call constructor on 3 args
        ConstructorOverloading obj5 = new ConstructorOverloading(500); //call constructor on 1 args
        ConstructorOverloading obj6 = new ConstructorOverloading(10,'h');

        obj1.test();

    }
    //method place
    public void test (){
        System.out.println("test");
    }


}
