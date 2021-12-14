package de.dummyapt.java_sandbox.simpleobserver;

sealed interface Observable permits SimpleSubject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}