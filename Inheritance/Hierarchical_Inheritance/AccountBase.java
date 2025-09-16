class AccountBase {
    String accId;
    double amt;

    AccountBase(String accId, double amt) {
        this.accId = accId;
        this.amt = amt;
    }

    void showDetails() {
        System.out.println("Account ID: " + accId);
        System.out.println("Balance: ₹" + amt);
    }
}

class SaveAcc extends AccountBase {
    double rate;

    SaveAcc(String accId, double amt, double rate) {
        super(accId, amt);
        this.rate = rate;
    }

    void displayAccountType() {
        showDetails();
        System.out.println("Type: Savings Account");
        System.out.println("Interest Rate: " + rate + "%");
    }
}

class CurrentAcc extends AccountBase {
    double limit;

    CurrentAcc(String accId, double amt, double limit) {
        super(accId, amt);
        this.limit = limit;
    }

    void displayAccountType() {
        showDetails();
        System.out.println("Type: Checking Account");
        System.out.println("Withdrawal Limit: ₹" + limit);
    }
}

class FDAcc extends AccountBase {
    int duration;

    FDAcc(String accId, double amt, int duration) {
        super(accId, amt);
        this.duration = duration;
    }

    void displayAccountType() {
        showDetails();
        System.out.println("Type: Fixed Deposit Account");
        System.out.println("Term: " + duration + " years");
    }
}

public class BankingApp {
    public static void main(String[] args) {
        SaveAcc s1 = new SaveAcc("S111", 30000, 5.2);
        CurrentAcc c1 = new CurrentAcc("C222", 20000, 6000);
        FDAcc f1 = new FDAcc("F333", 120000, 7);

        s1.displayAccountType();
        System.out.println();
        c1.displayAccountType();
        System.out.println();
        f1.displayAccountType();
    }
}
