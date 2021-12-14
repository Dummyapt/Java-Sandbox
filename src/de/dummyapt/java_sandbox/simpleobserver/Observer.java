package de.dummyapt.java_sandbox.simpleobserver;

sealed interface Observer permits SimpleObserver {
    void update(int value);
}