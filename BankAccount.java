public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double checkBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 1000);
        account.deposit(500);
        account.withdraw(300);
        System.out.println("Balance: " + account.checkBalance());
        account.withdraw(1500);
    }
}
