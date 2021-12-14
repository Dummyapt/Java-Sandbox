package de.dummyapt.java_sandbox.generics;

final class Generics {
    private final Container<Content> mixContainer;
    private final Container<Stone> stoneContainer;
    private final Container<Wood> woodContainer;

    public Generics() {
        mixContainer = new Container<>(1_500);
        woodContainer = new Container<>(1_000);
        stoneContainer = new Container<>(2_500);
    }

    public static void main(String[] args) {
        var generics = new Generics();
        generics.addContent();
        generics.listContent();
    }

    private void addContent() {
        try {
            mixContainer.add(new Wood(90, "Rotbuche"));
            mixContainer.add(new Wood(15, "Fichte"));
            mixContainer.add(new Stone(1_000));
            mixContainer.add(new Stone(750));
        } catch (ContainerFillException e) {
            e.printStackTrace();
        }

        try {
            stoneContainer.add(new Stone(100));
            stoneContainer.add(new Stone(50));
            stoneContainer.add(new Stone(1_500));
        } catch (ContainerFillException e) {
            e.printStackTrace();
        }

        try {
            woodContainer.add(new Wood(15, "Buche"));
            woodContainer.add(new Wood(70, "Eiche"));
            woodContainer.add(new Wood(25, "Kiefer"));
        } catch (ContainerFillException e) {
            e.printStackTrace();
        }
    }

    private void listContent() {
        var maxWeightString = "Max capacity: %skg%n";
        var currentWeight = "Current weight: %skg%n";
        var list = new StringBuilder();

        list.append("MIXER\n")
                .append(String.format(maxWeightString, mixContainer.getMaxWeight()))
                .append(String.format(currentWeight, mixContainer.getCurrentWeight()))
                .append("\nSTONE CONTAINER\n")
                .append(String.format(maxWeightString, stoneContainer.getMaxWeight()))
                .append(String.format(currentWeight, stoneContainer.getCurrentWeight()))
                .append("\nWOOD CONTAINER\n")
                .append(String.format(maxWeightString, woodContainer.getMaxWeight()))
                .append(String.format(currentWeight, woodContainer.getCurrentWeight()))
                .append("\nWOOD CONTAINER CONTENT\n");

        for (var i = 0; i < woodContainer.getContents().size(); i++) {
            var type = woodContainer.getContents().get(i).type();
            var weight = woodContainer.getContents().get(i).weight();
            list.append(String.format("-%s (%skg)%n", type, weight));
        }
        System.out.println(list);
    }
}