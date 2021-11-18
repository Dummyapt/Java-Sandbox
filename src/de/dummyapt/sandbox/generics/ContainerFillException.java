package de.dummyapt.sandbox.generics;

final class ContainerFillException extends Exception {
    private final Content content;

    public ContainerFillException(Content content) {
        super(String.format("Container wird überfüllt! Verursacher: %s", content));
        this.content = content;
    }

    public Content getContent() {
        return content;
    }
}