class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {
    int depositPeriod;

    FixedDepositAccount(String accountNumber, double balance, int depositPeriod) {
        super(accountNumber, balance);
        this.depositPeriod = depositPeriod;
    }

    @Override
    void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Deposit Period: " + depositPeriod + " months");
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA101", 20000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA202", 15000, 5000);
        FixedDepositAccount fda = new FixedDepositAccount("FDA303", 100000, 24);

        sa.displayAccountType();
        sa.displayAccountInfo();
        System.out.println();

        ca.displayAccountType();
        ca.displayAccountInfo();
        System.out.println();

        fda.displayAccountType();
        fda.displayAccountInfo();
    }
}
