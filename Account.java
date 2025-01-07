
// Account.java
import java.io.Serializable;
import java.io.*;
import java.util.*;

public class Account implements Serializable {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // getters and setters
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // Additional methods for transfer etc.
}

// Bank.java

public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
        loadAccounts();
    }

    private void loadAccounts() {
        // Read from accounts file and populate the accounts list
    }

    public Account createAccount(String name, double initialBalance) {
        // Create and add new account
    }

    public Account findAccount(String accountNumber) {
        // Find and return account by accountNumber
    }

    public void performTransaction() {
        // Logic to handle user input and perform transaction
    }

    private void saveAccounts() {
        // Save accounts back to file
    }
}