package oops.polymorphism.overloading;

public class Q7_Billing_System {
    public static void main(String[] args) {

        BillCalculator bill = new BillCalculator();
        // 1. Basic bill (no discount, no GST)
        double total1 = bill.calculateBill(5, 100);
        System.out.println("Total (no discount, no GST): ₹" + total1);

        // 2. Bill with discount
        double total2 = bill.calculateBill(5, 100, 10); // 10% discount
        System.out.println("Total (with 10% discount): ₹" + total2);

        // 3. Bill with discount and GST
        double total3 = bill.calculateBill(5, 100, 10, 18); // 10% discount, 18% GST
        System.out.println("Total (with 10% discount and 18% GST): ₹" + total3);

    }
}

class BillCalculator{

    // Overload 1: Quantity and Price only
    double calculateBill(int quantity, double pricePerItem) {
        return quantity * pricePerItem;
    }

    // Overload 2: Quantity, Price, and Discount
    double calculateBill(int quantity, double pricePerItem, double discountPercent) {
        double total = quantity * pricePerItem;
        double discount = (discountPercent / 100) * total;
        return total - discount;
    }

    // Overload 3: Quantity, Price, Discount, and GST
    double calculateBill(int quantity, double pricePerItem, double discountPercent, double gstPercent) {
        double total = quantity * pricePerItem;
        double discount = (discountPercent / 100) * total;
        double discountedTotal = total - discount;
        double gst = (gstPercent / 100) * discountedTotal;
        return discountedTotal + gst;
    }

}