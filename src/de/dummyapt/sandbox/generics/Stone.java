package de.dummyapt.sandbox.generics;

record Stone(int weight) implements Content {

    @Override
    public int getWeight() {
        return weight;
    }
}