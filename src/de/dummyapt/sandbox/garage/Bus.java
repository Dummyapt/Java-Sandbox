package de.dummyapt.sandbox.garage;

class Bus extends Vehicle implements Horn {

    public Bus(Colors color, int wheels) {
        super(color, wheels);
    }

    @Override
    public void horn() {
        System.out.println("Mööööp!");
    }
}