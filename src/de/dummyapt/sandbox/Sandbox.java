package de.dummyapt.sandbox;

final class Sandbox {
    public static void main(String[] args) {
        switchCases(5);
    }

    private static void switchCases(int i) {
        switch (i) {
            case 0 -> System.out.println("Zero");
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            default -> System.out.println("Default!");
        }
    }
}