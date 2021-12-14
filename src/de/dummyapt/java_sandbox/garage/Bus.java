package de.dummyapt.java_sandbox.garage;

final class Bus extends Vehicle implements Features {
    public Bus(Colors color, int wheels) {
        super(color, wheels);
    }

    @Override
    public void horn() {
        System.out.println("Mööööp!");
    }
}