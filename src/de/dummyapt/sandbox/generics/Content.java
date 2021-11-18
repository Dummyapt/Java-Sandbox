package de.dummyapt.sandbox.generics;

sealed interface Content permits Stone, Wood {
    int getWeight();
}