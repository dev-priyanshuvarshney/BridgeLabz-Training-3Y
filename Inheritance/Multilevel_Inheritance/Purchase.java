class Purchase {
    String purchaseId;
    String purchaseDate;

    Purchase(String purchaseId, String purchaseDate) {
        this.purchaseId = purchaseId;
        this.purchaseDate = purchaseDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class Dispatch extends Purchase {
    String trackId;

    Dispatch(String purchaseId, String purchaseDate, String trackId) {
        super(purchaseId, purchaseDate);
        this.trackId = trackId;
    }

    String getOrderStatus() {
        return "Order Shipped";
    }
}

class Arrival extends Dispatch {
    String arrivalDate;

    Arrival(String purchaseId, String purchaseDate, String trackId, String arrivalDate) {
        super(purchaseId, purchaseDate, trackId);
        this.arrivalDate = arrivalDate;
    }

    String getOrderStatus() {
        return "Order Delivered";
    }
}

public class RetailSystem {
    public static void main(String[] args) {
        Arrival order = new Arrival("OR567", "2025-09-10", "TR9087", "2025-09-15");
        System.out.println("Purchase ID: " + order.purchaseId);
        System.out.println("Date: " + order.purchaseDate);
        System.out.println("Tracking: " + order.trackId);
        System.out.println("Delivered On: " + order.arrivalDate);
        System.out.println("Status: " + order.getOrderStatus());
    }
}
