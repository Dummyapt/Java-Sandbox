package de.dummyapt.sandbox.generics;

class Generics {
    private final Container<Content> mixContainer;
    private final Container<Stone> stoneContainer;
    private final Container<Wood> woodContainer;

    Generics() {
        mixContainer = new Container<>(1_500);
        woodContainer = new Container<>(1_000);
        stoneContainer = new Container<>(2_500);
    }

    public static void main(String[] args) {
        var generics = new Generics();
        generics.addContent();
        generics.listContent();
    }

    void addContent() {
        try {
            mixContainer.add(new Wood(90, "Rotbuche"));
            mixContainer.add(new Wood(15, "Fichte"));
            mixContainer.add(new Stone(1_000));
            mixContainer.add(new Stone(750));
        } catch (ContainerFillException e) {
            e.printStackTrace();
            System.out.println(e.getContent());
        }

        try {
            stoneContainer.add(new Stone(100));
            stoneContainer.add(new Stone(50));
            stoneContainer.add(new Stone(1_500));
        } catch (ContainerFillException e) {
            e.printStackTrace();
            System.out.println(e.getContent());
        }

        try {
            woodContainer.add(new Wood(15, "Buche"));
            woodContainer.add(new Wood(70, "Eiche"));
            woodContainer.add(new Wood(25, "Kiefer"));
        } catch (ContainerFillException e) {
            e.printStackTrace();
            System.out.println(e.getContent());
        }
    }

    void listContent() {
        var maxWeightString = "Max capacity: %skg";
        var currentWeight = "Current weight: %skg";

        println("MIXER");
        println(formatText(maxWeightString, mixContainer.maxWeight));
        println(formatText(currentWeight, mixContainer.currentWeight));
        println("");

        println("STONE CONTAINER");
        println(formatText(maxWeightString, stoneContainer.maxWeight));
        println(formatText(currentWeight, stoneContainer.currentWeight));
        println("");

        println("WOOD CONTAINER");
        println(formatText(maxWeightString, woodContainer.maxWeight));
        println(formatText(currentWeight, woodContainer.currentWeight));
        println("Content:");

        for (int i = 0; i < woodContainer.contents.size(); i++) {
            var types = "";
            types += woodContainer.contents.get(i).type() + " ";
            var sb = new StringBuilder();
            for (var weight : types.split(" ")) {
                sb.append("-").append(weight).append(" (").append(woodContainer.contents.get(i).weight()).append("kg)");
            }
            println(sb.toString());
        }
    }

    private void println(String s) {
        System.out.println(s);
    }

    private String formatText(String s, int i) {
        return String.format(s, i);
    }
}