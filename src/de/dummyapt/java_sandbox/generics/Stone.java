package de.dummyapt.java_sandbox.generics;

record Stone(int weight) implements Content {

    @Override
    public int getWeight() {
        return weight;
    }
}