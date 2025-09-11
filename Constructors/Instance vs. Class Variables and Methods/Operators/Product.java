class Product {
    static double discount = 10.0;
    final String productID;
    String productName;
    double price;
    int quantity;

    Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    void displayProductDetails(Object obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;
            System.out.println("Product ID: " + p.productID);
            System.out.println("Name: " + p.productName);
            System.out.println("Price: " + p.price);
            System.out.println("Quantity: " + p.quantity);
            double discountedPrice = p.price - (p.price * discount / 100);
            System.out.println("Discounted Price: " + discountedPrice);
        } else {
            System.out.println("Not a Product object.");
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product p1 = new Product("P101", "Laptop", 50000, 1);
        Product p2 = new Product("P102", "Headphones", 2000, 2);
        p1.displayProductDetails(p1);
        p2.displayProductDetails(p2);
        Product.updateDiscount(20.0);
        p1.displayProductDetails(p1);
        String notProduct = "Invalid Object";
        p2.displayProductDetails(notProduct);
    }
}
