package core_java.E_Constructors;

public class This_Keyword {
    public static void main(String[] args) {
        This_Keyword obj = new This_Keyword();
        System.out.println(obj); //print address of obj
        obj.test(); //nonstatic method which print obj address
    }
    public void test (){
        System.out.println(this);
    }
}
