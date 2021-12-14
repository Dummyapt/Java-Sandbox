package de.dummyapt.java_sandbox.simpleobserver;

import java.util.Random;

final class Example {
    public static void main(String[] args) {
        var simpleSubject = new SimpleSubject();
        var simpleObserver = new SimpleObserver(simpleSubject);

        try {
            for (var i = 0; i < 5; i++) {
                simpleSubject.setValue(new Random().nextInt() * 100);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        } finally {
            simpleSubject.removeObserver(simpleObserver);
        }
    }
}