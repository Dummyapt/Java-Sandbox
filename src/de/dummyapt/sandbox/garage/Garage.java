package de.dummyapt.sandbox.garage;

class Garage {
    Garage() {
        var v1 = new Car();
        var v2 = new Bus();

        v1.horn();
        v2.horn();
    }

    public static void main(String[] args) {
        new Garage();
    }
}