package de.dummyapt.sandbox.generics;

import java.io.Serializable;

class ContainerFillException extends Exception implements Serializable {
    private final Content content;

    ContainerFillException(Content content) {
        super("Container wird überfüllt!");
        this.content = content;
    }

    Content getContent() {
        return content;
    }
}