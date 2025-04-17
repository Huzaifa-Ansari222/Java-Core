package core_java.E_Constructors;

public class This_Advance2 {
    This_Advance2(int x){
        System.out.println(x);
    }
    This_Advance2(){
        this(200); // call that constructor  / this() should be first statment always , always on top {here then any code}
    }
    public static void main(String[] args) {
        This_Advance2 obj = new This_Advance2();
    }
}
