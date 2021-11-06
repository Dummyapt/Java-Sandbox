package de.dummyapt.sandbox.bankingapplication;

class BankAccount {
    double balance;
    String firstName;
    String lastName;

    public BankAccount(double balance, String firstName, String lastName) {
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}