package de.dummyapt.sandbox.generics;

import java.util.ArrayList;
import java.util.List;

class Container<T extends Content> {
    final List<T> contents;
    final int maxWeight;
    int currentWeight;

    Container(int maxWeight) {
        this.maxWeight = maxWeight;
        contents = new ArrayList<>();
    }

    void add(T newContent) throws ContainerFillException {
        if (currentWeight == maxWeight || newContent.getWeight() + currentWeight > maxWeight) {
            throw new ContainerFillException(newContent);
        } else {
            contents.add(newContent);
            currentWeight += newContent.getWeight();
        }
    }
}