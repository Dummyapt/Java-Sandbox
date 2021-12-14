package de.dummyapt.java_sandbox.garage;

sealed interface Features permits Bus, Car {
    void horn();
}