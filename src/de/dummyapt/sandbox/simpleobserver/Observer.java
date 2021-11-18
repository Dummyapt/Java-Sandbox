package de.dummyapt.sandbox.simpleobserver;

sealed interface Observer permits SimpleObserver {
    void update(int value);
}