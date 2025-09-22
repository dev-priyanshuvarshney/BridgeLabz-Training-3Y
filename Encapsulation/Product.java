interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public abstract double calculateDiscount();

    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Electronics extends Product implements Taxable {
    private double discountRate = 0.10;
    private double taxRate = 0.18;

    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "18% GST on Electronics";
    }
}

class Clothing extends Product implements Taxable {
    private double discountRate = 0.20;
    private double taxRate = 0.05;

    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "5% GST on Clothing";
    }
}

class Groceries extends Product {
    private double discountRate = 0.05;

    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }
}

public class ECommercePlatform {
    public static void printFinalPrice(Product[] products) {
        for (Product p : products) {
            p.displayDetails();
            double discount = p.calculateDiscount();
            double tax = 0;
            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax();
                System.out.println("Tax Details: " + ((Taxable) p).getTaxDetails());
            }
            double finalPrice = p.getPrice() + tax - discount;
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("--------------------------------");
        }
    }

    public static void main(String[] args) {
        Product p1 = new Electronics(201, "Laptop", 50000);
        Product p2 = new Clothing(202, "T-Shirt", 1000);
        Product p3 = new Groceries(203, "Apples", 500);

        Product[] products = {p1, p2, p3};
        printFinalPrice(products);
    }
}
