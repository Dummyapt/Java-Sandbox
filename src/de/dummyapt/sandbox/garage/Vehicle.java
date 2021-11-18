package de.dummyapt.sandbox.garage;

sealed class Vehicle permits Bus, Car {
    private final Colors color;
    private final int wheels;

    public Vehicle(Colors color, int wheels) {
        this.color = color;
        this.wheels = wheels;
    }

    public Colors getColor() {
        return color;
    }

    public int getWheels() {
        return wheels;
    }
}