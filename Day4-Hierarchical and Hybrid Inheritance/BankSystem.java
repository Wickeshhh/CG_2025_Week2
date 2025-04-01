package Inheritance;
// Base Class: BankAccount
class BankAccount {
    String accountNumber;
    double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }
}
// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    double interestRate;
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    public void displayAccountType() {
        System.out.println("This is a Savings Account with interest rate: " + interestRate + "%");
    }
}
// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    public void displayAccountType() {
        System.out.println("This is a Checking Account with a withdrawal limit of $" + withdrawalLimit);
    }
}
// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    int depositTerm;
    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }
    public void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account with a term of " + depositTerm + " years");
    }
}
// Main Class
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA12345", 5000, 3.5);
        CheckingAccount ca = new CheckingAccount("CA67890", 3000, 1000);
        FixedDepositAccount fda = new FixedDepositAccount("FD11223", 10000, 5);
        sa.displayInfo();
        sa.displayAccountType();
        System.out.println();
        ca.displayInfo();
        ca.displayAccountType();
        System.out.println();
        fda.displayInfo();
        fda.displayAccountType();
    }
}
