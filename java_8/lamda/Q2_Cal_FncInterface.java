package java_8.lamda;

public class Q2_Cal_FncInterface {
    public static void main(String[] args) {
        // no name method with body / in parameter no need to write dataType (optional)
       /*
        Calculator sumOf = (a, b) ->{
            int sum;
            sum=a+b;
            return sum;
        };
        */
        Calculator sumOf = (a, b) -> a + b;

        int print = sumOf.add(2,3);
        System.out.println(print);
    }
}

@FunctionalInterface
interface Calculator {
    int add(int a, int b);//only 1 abstract method no body
}
