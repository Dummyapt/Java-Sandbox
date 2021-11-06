package de.dummyapt.sandbox.generics;

record Wood(int weight, String type) implements Content {

    @Override
    public int getWeight() {
        return weight;
    }
}