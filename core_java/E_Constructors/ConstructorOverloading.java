package core_java.E_Constructors;

//constructor overloading
public class ConstructorOverloading {
    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading(); //call constructor on 0 args
        ConstructorOverloading obj2 = new ConstructorOverloading(10); //call constructor on 1 args
        ConstructorOverloading obj3 = new ConstructorOverloading(100,20); //call constructor on 2 args
        ConstructorOverloading obj4 = new ConstructorOverloading(1000,200,30); //call constructor on 3 args
        ConstructorOverloading obj5 = new ConstructorOverloading(500); //call constructor on 1 args


    }

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
    ConstructorOverloading(int x, int y, int z){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
