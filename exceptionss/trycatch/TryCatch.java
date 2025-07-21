package exceptionss.trycatch;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("Program start...");
        try {
            int a = 10, div;
            div = a / 0; //ArithmeticException error
        } catch (ArithmeticException e ){ //RuntimeException error / 'e' have address of that object(ArithmeticException) / pre define exception name
            System.out.println(e); // printing error
            System.out.println("reason"+e.getMessage()); //give message of error
            e.printStackTrace(); //give line of error and reason
        }
        System.out.println("Program continue after execution");
    }

}
