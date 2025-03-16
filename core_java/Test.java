package core_java;

public class Test {
    //non static can be acessable in obj
    int x=10;

    //static cant be acessable in obj
    static int y = 20;
    public static void main(String[] args) {

        Test obj1 = new Test ();
        System.out.println(obj1.x);// way to acess class if non static
        System.out.println(Test.y); //way to acess class thing if static

    }
}
