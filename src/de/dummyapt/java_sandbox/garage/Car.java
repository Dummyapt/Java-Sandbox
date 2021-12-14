package de.dummyapt.java_sandbox.garage;

final class Car extends Vehicle implements Features {
    public Car(Colors color, int wheels) {
        super(color, wheels);
    }

    @Override
    public void horn() {
        System.out.println("Beep!");
    }
}