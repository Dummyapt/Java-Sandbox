package de.dummyapt.sandbox.bankingapplication;

import java.util.Scanner;

final class BankingApplication {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final BankAccount BANK_ACCOUNT = new BankAccount("1208", "Dummy");

    public static void main(String[] args) {
        log(String.format("Welcome, %s!", BANK_ACCOUNT.getName()));
        log(String.format("Your ID is %s!%n", BANK_ACCOUNT.getId()));
        showMenu();
    }

    private static void showMenu() {
        log("""
                ===============================
                        Enter an option
                ===============================
                A - Check balance
                B - Deposit
                C - Withdraw
                D - Previous transaction
                E - Exit""");

        char option = SCANNER.next().toUpperCase().charAt(0);
        switch (option) {
            case 'A' -> {
                log(String.format("Balance: %s", BANK_ACCOUNT.getBalance()));
                showMenu();
            }
            case 'B' -> {
                log("Amount to deposit:");
                BANK_ACCOUNT.deposit(Math.abs(SCANNER.nextInt()));
                showMenu();
            }
            case 'C' -> {
                log("Amount to withdraw:");
                BANK_ACCOUNT.withdraw(Math.abs(SCANNER.nextInt()));
                showMenu();
            }
            case 'D' -> {
                log(String.format("Last transaction: %n%s", BANK_ACCOUNT.getPreviousTransaction()));
                showMenu();
            }
            case 'E' -> log(String.format("Goodbye, %s", BANK_ACCOUNT.getName()));
            default -> {
                log("Error! Wrong option.");
                showMenu();
            }
        }
    }

    private static void log(String s) {
        System.out.println(s);
    }
}