package core_java.E_Constructors;

public class This_Advance {
    This_Advance(){
        System.out.println("hi");//will called by this();
    }
    This_Advance(int x){
        this();//call construtor This_Advance(){} auto called without making any object
    }
    public static void main(String[] args) {
        This_Advance obj = new This_Advance(100);

    }
}
