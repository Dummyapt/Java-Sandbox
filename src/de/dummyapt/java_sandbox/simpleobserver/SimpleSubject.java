package de.dummyapt.java_sandbox.simpleobserver;

import java.util.ArrayList;

final class SimpleSubject implements Observable {
    private final ArrayList<Observer> observers;
    private int value;

    public SimpleSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (var observer : observers)
            observer.update(value);
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}