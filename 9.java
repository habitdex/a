import java.util.ArrayList;
import java.util.List;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void calculateInterest();
    void viewBalance();
}

class SavingsAccount implements Account {
    private double balance = 0;
    private double interestRate = 0.05;

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
    }

    @Override
    public void calculateInterest() {
        balance += balance * interestRate;
    }

    @Override
    public void viewBalance() {
        System.out.println("Savings Balance: $" + balance);
    }
}

class CurrentAccount implements Account {
    private double balance = 0;

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
    }

    @Override
    public void calculateInterest() {
        System.out.println("No interest on current account.");
    }

    @Override
    public void viewBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void showAccounts() {
        for (Account account : accounts) account.viewBalance();
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingsAccount sa = new SavingsAccount();
        CurrentAccount ca = new CurrentAccount();

        sa.deposit(500);
        ca.deposit(1000);

        bank.addAccount(sa);
        bank.addAccount(ca);

        sa.calculateInterest();
        bank.showAccounts();
    }
}

