package Assignment2;

public class ShoppingCart {

    double calculateTotal(double item1, double item2, double item3) {
        return item1 + item2 + item3;
    }

    double calculateDiscount(double amount, String memberType) {
        if (memberType.equalsIgnoreCase("Gold"))
            return amount * 0.20;
        else if (memberType.equalsIgnoreCase("Silver"))
            return amount * 0.10;
        else
            return amount * 0.05;
    }

    double calculateFinalAmount(double amount, double discount) {
        return amount - discount;
    }

    void displayBill(double totalAmount, double discountAmount,double finalAmount) {
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Discount: " + discountAmount);
        System.out.println("Final Amount: " + finalAmount);
    }

    public static void main(String[] args) {
        ShoppingCart obj = new ShoppingCart();

        double totalAmount = obj.calculateTotal(2000, 1500, 500);
        double discountAmount = obj.calculateDiscount(totalAmount, "Gold");
        double payableAmount = obj.calculateFinalAmount(totalAmount, discountAmount);

        obj.displayBill(totalAmount, discountAmount, payableAmount);
    }
}
