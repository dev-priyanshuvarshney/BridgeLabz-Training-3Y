interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

class VegItem extends FoodItem implements Discountable {
    private double discountRate = 0.10;

    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * discountRate;
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount on Veg Items";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double nonVegCharge = 50;
    private double discountRate = 0.05;

    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + nonVegCharge;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * discountRate;
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount on Non-Veg Items (extra charge applied)";
    }
}

public class OnlineFoodDeliverySystem {
    public static void processOrder(FoodItem[] items) {
        for (FoodItem item : items) {
            item.getItemDetails();
            double total = item.calculateTotalPrice();
            double discount = 0;
            if (item instanceof Discountable) {
                discount = ((Discountable) item).applyDiscount();
                System.out.println("Discount Details: " + ((Discountable) item).getDiscountDetails());
            }
            double finalPrice = total - discount;
            System.out.println("Total Price: " + total);
            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("--------------------------------");
        }
    }

    public static void main(String[] args) {
        FoodItem f1 = new VegItem("Paneer Tikka", 200, 2);
        FoodItem f2 = new NonVegItem("Chicken Biryani", 300, 1);

        FoodItem[] order = {f1, f2};
        processOrder(order);
    }
}
