class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Checking Account");
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int termInMonths;

    public FixedDepositAccount(String accountNumber, double balance, int termInMonths) {
        super(accountNumber, balance);
        this.termInMonths = termInMonths;
    }

    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
        System.out.println("Term: " + termInMonths + " months");
    }
}

public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SAV123", 5000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("CHK456", 2000.0, 1000.0);
        FixedDepositAccount fd = new FixedDepositAccount("FD789", 10000.0, 12);

        savings.displayAccountType();
        System.out.println("Balance: $" + savings.getBalance());
        System.out.println();

        checking.displayAccountType();
        System.out.println("Balance: $" + checking.getBalance());
        System.out.println();

        fd.displayAccountType();
        System.out.println("Balance: $" + fd.getBalance());
    }
}
