package de.dummyapt.sandbox.bankingapplication;

class BankAccount {
    private final String id;
    private final String name;
    private int balance;
    private int previousTransaction;

    public BankAccount(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    void deposit(int amount) {
        if (amount <= 0)
            log("Error! Deposit can't be below or equal to 0.");
        else {
            balance += amount;
            previousTransaction = amount;
            log("Deposit succeeded!");
            log(String.format("New balance: %s%n", balance));
        }
    }

    void withdraw(int amount) {
        if (amount <= 0)
            log("Error! Withdraw can't be below or equal to 0.");
        else {
            balance -= amount;
            previousTransaction = -amount;
            log("Withdraw succeeded!");
            log(String.format("New balance: %s", balance));
        }
    }

    String getPreviousTransaction() {
        if (previousTransaction > 0)
            return String.format("Deposited: %s", previousTransaction);
        else if (previousTransaction < 0)
            return String.format("Withdrawn: %s", Math.abs(previousTransaction));
        else
            return "No previous transaction!";
    }

    private void log(String s) {
        System.out.println(s);
    }
}