package de.dummyapt.sandbox.simpleobserver;

final class SimpleObserver implements Observer {
    public SimpleObserver(Observable simpleSubject) {
        simpleSubject.registerObserver(this);
    }

    @Override
    public void update(int value) {
        System.out.printf("[Observer] The new value of the subject is: %s%n", value);
    }
}