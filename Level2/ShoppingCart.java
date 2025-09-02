import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return price * quantity;
    }

    void displayItem() {
        System.out.println(itemName + " - Price: " + price + " x " + quantity + " = " + getTotalPrice());
    }
}

class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();

    void addItem(CartItem item) {
        items.add(item);
        System.out.println(item.itemName + " added to cart.");
    }

    void removeItem(String itemName) {
        boolean removed = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).itemName.equalsIgnoreCase(itemName)) {
                System.out.println(items.get(i).itemName + " removed from cart.");
                items.remove(i);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Item not found in cart.");
        }
    }

    void displayTotal() {
        double total = 0;
        System.out.println("\nCart Items:");
        for (CartItem item : items) {
            item.displayItem();
            total += item.getTotalPrice();
        }
        System.out.println("Total Cost: " + total);
        System.out.println("-------------------------");
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        CartItem i1 = new CartItem("Laptop", 55000, 1);
        CartItem i2 = new CartItem("Mouse", 800, 2);
        CartItem i3 = new CartItem("Headphones", 2500, 1);

        cart.addItem(i1);
        cart.addItem(i2);
        cart.addItem(i3);

        cart.displayTotal();

        cart.removeItem("Mouse");
        cart.displayTotal();
    }
}
