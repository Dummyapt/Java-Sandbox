package de.dummyapt.sandbox.garage;

class Car extends Vehicle implements Horn {

    public Car(Colors color, int wheels) {
        super(color, wheels);
    }

    @Override
    public void horn() {
        System.out.println("Beep!");
    }
}