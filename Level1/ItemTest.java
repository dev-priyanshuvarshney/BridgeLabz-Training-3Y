class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails(int quantity) {
        double totalCost = price * quantity;
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
        System.out.println("------------------------");
    }
}

public class ItemTest {
    public static void main(String[] args) {
        Item i1 = new Item(101, "Laptop", 55000);
        Item i2 = new Item(102, "Mouse", 800);

        i1.displayDetails(2);
        i2.displayDetails(5);
    }
}
