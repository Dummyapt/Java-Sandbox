package de.dummyapt.sandbox.singleton;

import java.util.logging.Logger;

class Singleton {
    private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private static final Singleton OBJ = new Singleton();

    private Singleton() {
        LOGGER.warning("Object was created.");
    }

    public static Singleton getInstance() {
        return OBJ;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
    }
}
