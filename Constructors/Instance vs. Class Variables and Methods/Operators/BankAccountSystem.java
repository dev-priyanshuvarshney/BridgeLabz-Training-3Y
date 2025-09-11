class BankAccount {
    static String bankName = "State Bank of India";
    static int totalAccounts = 0;
    final String accountNumber;
    String accountHolderName;

    BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayAccountDetails(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount acc = (BankAccount) obj;
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + acc.accountHolderName);
            System.out.println("Account Number: " + acc.accountNumber);
        } else {
            System.out.println("Not a BankAccount object.");
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Priya Sharma", "ACC1001");
        BankAccount acc2 = new BankAccount("Rohan Mehta", "ACC1002");
        acc1.displayAccountDetails(acc1);
        acc2.displayAccountDetails(acc2);
        BankAccount.getTotalAccounts();
        String notAccount = "Hello";
        acc1.displayAccountDetails(notAccount);
    }
}
