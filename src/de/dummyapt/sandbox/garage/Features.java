package de.dummyapt.sandbox.garage;

sealed interface Features permits Bus, Car {
    void horn();
}