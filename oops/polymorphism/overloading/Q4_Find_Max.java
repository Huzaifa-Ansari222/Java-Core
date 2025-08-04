package oops.polymorphism.overloading;

public class Q4_Find_Max {
    public static void main(String[] args) {
        System.out.println(max(2, 4));
        System.out.println(max(8.2, 3.22));
        System.out.println(max(0,0,1));
    }

    public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        else return num2;
    }

    public static double max(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        }
        else return num2;
    }
    public static int max(int num1, int num2, int num3) {
        int max = 0;
        if (num1 > max) {
            max = num1;
        }
        if (num2 >max){
            max = num2;
        }
        if (num3>max){
            max = num3;
//            return num3;
        }
        else {
            return max;
        }
        return max;
    }
}
