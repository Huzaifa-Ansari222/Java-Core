package exceptionss.multiple;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length()); //NullPointerException

            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); //ArrayIndexOutOfBoundsException
        } catch (NullPointerException e) {
            System.out.println(e);
//            System.out.println("⚠ Null value found!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
//            System.out.println("⚠ Invalid array index!");
        } catch (Exception e) {
            System.out.println(e);
//            System.out.println("⚠ General Exception: " + e);
        }
    }
}