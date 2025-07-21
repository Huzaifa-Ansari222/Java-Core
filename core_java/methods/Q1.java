package core_java.methods;

public class Q1 {
    public static void main(String[]args){
        System.out.println(result("Juniad Ansari",34,400));
        System.out.println(result("Huzaifa Ansari",35,295));
        System.out.println( result("Amir Ansari",36,305));

    }
    public static String result(String x,int y,int z) {
        if (z > 300) {
            return "pass";
        }
        else {
            return "fail";
        }
    }



}
