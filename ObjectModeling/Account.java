class Account {
    private int accountNumber;
    private double balance;
    private Bank bank;

    public Account(int accountNumber, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }

    public String toString() {
        return "Account No: " + accountNumber + ", Balance: " + balance + ", Bank: " + bank.getName();
    }
}

class Customer {
    private String name;
    private Account[] accounts;
    private int count;

    public Customer(String name, int maxAccounts) {
        this.name = name;
        accounts = new Account[maxAccounts];
        count = 0;
    }

    public void addAccount(Account acc) {
        if (count < accounts.length) {
            accounts[count++] = acc;
        }
    }

    public void viewBalance() {
        System.out.println("Customer: " + name);
        for (int i = 0; i < count; i++) {
            System.out.println(accounts[i]);
        }
        System.out.println();
    }
}

class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Account openAccount(Customer c, int accountNumber, double initialDeposit) {
        Account acc = new Account(accountNumber, initialDeposit, this);
        c.addAccount(acc);
        return acc;
    }
}

public class AssociationDemo {
    public static void main(String[] args) {
        Bank b1 = new Bank("State Bank");
        Bank b2 = new Bank("Central Bank");

        Customer c1 = new Customer("Alice", 3);
        Customer c2 = new Customer("Bob", 3);

        b1.openAccount(c1, 101, 5000);
        b1.openAccount(c1, 102, 15000);

        b2.openAccount(c2, 201, 7000);

        c1.viewBalance();
        c2.viewBalance();
    }
}
