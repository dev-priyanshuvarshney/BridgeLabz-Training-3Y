interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04;
    private double loanLimit = 50000;
    private double requestedLoan = 0;

    public SavingsAccount(String accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        this.requestedLoan = amount;
        System.out.println("Loan request of " + amount + " submitted for Savings Account.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return requestedLoan <= loanLimit && getBalance() > 1000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate = 0.02;
    private double loanLimit = 200000;
    private double requestedLoan = 0;

    public CurrentAccount(String accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        this.requestedLoan = amount;
        System.out.println("Loan request of " + amount + " submitted for Current Account.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return requestedLoan <= loanLimit && getBalance() > 5000;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SAV101", "Amit", 20000);
        BankAccount acc2 = new CurrentAccount("CUR202", "Riya", 100000);

        BankAccount[] accounts = {acc1, acc2};

        for (BankAccount acc : accounts) {
            acc.displayDetails();
            double interest = acc.calculateInterest();
            System.out.println("Calculated Interest: " + interest);

            if (acc instanceof Loanable) {
                ((Loanable) acc).applyForLoan(40000);
                System.out.println("Loan Eligibility: " + ((Loanable) acc).calculateLoanEligibility());
            }
            System.out.println("--------------------------------");
        }
    }
}
