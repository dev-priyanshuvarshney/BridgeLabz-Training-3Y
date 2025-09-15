class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + " ($" + price + ")";
    }
}

class Order {
    private int orderId;
    private Product[] products;
    private int count;
    private Customer customer;

    public Order(int orderId, Customer customer, int maxProducts) {
        this.orderId = orderId;
        this.customer = customer;
        products = new Product[maxProducts];
        count = 0;
    }

    public void addProduct(Product p) {
        if (count < products.length) {
            products[count++] = p;
        }
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += products[i].getPrice();
        }
        return total;
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId + " by " + customer.getName());
        for (int i = 0; i < count; i++) {
            System.out.println(products[i]);
        }
        System.out.println("Total: $" + getTotal());
        System.out.println();
    }
}

class Customer {
    private String name;
    private Order[] orders;
    private int count;

    public Customer(String name, int maxOrders) {
        this.name = name;
        orders = new Order[maxOrders];
        count = 0;
    }

    public String getName() {
        return name;
    }

    public Order placeOrder(int orderId, int maxProducts) {
        if (count < orders.length) {
            Order o = new Order(orderId, this, maxProducts);
            orders[count++] = o;
            return o;
        }
        return null;
    }

    public void showOrders() {
        System.out.println("Customer: " + name);
        for (int i = 0; i < count; i++) {
            orders[i].showOrderDetails();
        }
    }
}

public class ECommerceDemo {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 800);
        Product p2 = new Product("Phone", 500);
        Product p3 = new Product("Headphones", 100);

        Customer c1 = new Customer("Alice", 3);
        Customer c2 = new Customer("Bob", 3);

        Order o1 = c1.placeOrder(101, 5);
        o1.
