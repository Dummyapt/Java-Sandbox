package de.dummyapt.sandbox.garage;

final class Garage {
    public static void main(String[] args) {
        var v1 = new Car(Colors.BLACK, 4);
        var v2 = new Bus(Colors.GREEN, 6);

        v1.horn();
        System.out.printf("My Vehicle is %s and has %s wheels.%n", v1.getColor(), v1.getWheels());

        v2.horn();
        System.out.printf("My Vehicle is %s and has %s wheels.%n", v2.getColor(), v2.getWheels());
    }
}