package de.dummyapt.sandbox.generics;

import java.util.ArrayList;
import java.util.List;

final class Container<T extends Content> {
    private final List<T> contents;
    private final int maxWeight;
    private int currentWeight;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        contents = new ArrayList<>();
    }

    public List<T> getContents() {
        return contents;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public void add(T newContent) throws ContainerFillException {
        if (currentWeight == maxWeight || newContent.getWeight() + currentWeight > maxWeight) {
            throw new ContainerFillException(newContent);
        } else {
            contents.add(newContent);
            currentWeight += newContent.getWeight();
        }
    }
}