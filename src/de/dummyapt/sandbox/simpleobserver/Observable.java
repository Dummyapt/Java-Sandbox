package de.dummyapt.sandbox.simpleobserver;

sealed interface Observable permits SimpleSubject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}