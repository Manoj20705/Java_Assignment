package Assignment5;

class BaseProduct {
    int itemCode;
    double itemPrice;

    void display() {
        System.out.println("Product ID: " + itemCode);
        System.out.println("Price: " + itemPrice);
    }
}

class Electronics extends BaseProduct {
    void showCategory() {
        System.out.println("Category: Electronics");
        display();
    }
}

class Clothing extends BaseProduct {
    void showCategory() {
        System.out.println("Category: Clothing");
        display();
    }
}

class Books extends BaseProduct {
    void showCategory() {
        System.out.println("Category: Books");
        display();
    }
}

public class Product {
    public static void main(String[] args) {
        Electronics electronicItem = new Electronics();
        electronicItem.itemCode = 201;
        electronicItem.itemPrice = 25000;

        Clothing clothingItem = new Clothing();
        clothingItem.itemCode = 202;
        clothingItem.itemPrice = 1500;

        Books bookItem = new Books();
        bookItem.itemCode = 203;
        bookItem.itemPrice = 500;

        electronicItem.showCategory();
        System.out.println();

        clothingItem.showCategory();
        System.out.println();

        bookItem.showCategory();
    }
}