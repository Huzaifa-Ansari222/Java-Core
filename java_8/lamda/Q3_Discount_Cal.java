package java_8.lamda;

public class Q3_Discount_Cal {
    public static void main(String[] args) {
        PriceCalculator discount = (price, discountPercentage)->{
            double finalPrice = price - (price * discountPercentage / 100);
            return finalPrice;
        };
        double print =discount.calculate(2000,10);
        System.out.println(print);
    }
}
@FunctionalInterface
interface PriceCalculator{
    double calculate(double price, double discountPercentage);
}