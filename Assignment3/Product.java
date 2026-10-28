package Assignment3;

public class Product {

    int prodId;
    String prodName;
    double prodPrice;

    Product() {
        prodId = 0;
        prodName = "Unknown";
        prodPrice = 0.0;
    }

    Product(int id, String name) {
        prodId = id;
        prodName = name;
        prodPrice = 0.0;
    }

    Product(int id, String name, double price) {
        prodId = id;
        prodName = name;
        prodPrice = price;
    }

    void displayDetails() {
        System.out.println("Product ID: " + prodId);
        System.out.println("Product Name: " + prodName);
        System.out.println("Price: " + prodPrice);
        System.out.println();
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product(101, "Laptop");
        Product p3 = new Product(102, "Mobile", 25000);

        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();
    }
}