class BankUnit {
    String bankName;

    BankUnit(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Client c, double amt) {
        System.out.println("Bank: " + bankName + " opened an account for " + c.clientName);
        c.setBalance(amt);
    }
}

class Client {
    String clientName;
    double balance;
    BankUnit linkedBank;

    Client(String clientName, BankUnit linkedBank) {
        this.clientName = clientName;
        this.linkedBank = linkedBank;
        this.balance = 0.0;
    }

    void setBalance(double amt) {
        this.balance = amt;
    }

    void viewBalance() {
        System.out.println("Customer: " + clientName);
        System.out.println("Bank: " + linkedBank.bankName);
        System.out.println("Balance: ₹" + balance);
    }
}

public class AssociationDemo {
    public static void main(String[] args) {
        BankUnit b1 = new BankUnit("State Bank");
        BankUnit b2 = new BankUnit("Axis Bank");

        Client c1 = new Client("Rohan", b1);
        Client c2 = new Client("Neha", b2);

        b1.openAccount(c1, 5000);
        b2.openAccount(c2, 12000);

        System.out.println();
        c1.viewBalance();
        System.out.println();
        c2.viewBalance();
    }
}
