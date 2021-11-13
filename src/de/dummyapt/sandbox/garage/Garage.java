package de.dummyapt.sandbox.garage;

class Garage {
    public static void main(String[] args) {
        var v1 = new Car(Colors.BLACK, 4);
        var v2 = new Bus(Colors.GREEN, 6);

        v1.horn();
        v2.horn();
    }
}