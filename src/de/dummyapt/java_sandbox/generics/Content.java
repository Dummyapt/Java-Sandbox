package de.dummyapt.java_sandbox.generics;

sealed interface Content permits Stone, Wood {
    int getWeight();
}