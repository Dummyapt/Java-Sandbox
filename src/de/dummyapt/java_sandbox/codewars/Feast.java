package de.dummyapt.java_sandbox.codewars;

final class Feast {
    public static void main(String[] args) {
        System.out.println(feast("chickadee", "chocolate cake"));
        System.out.println(feast("great blue heron", "garlic nann"));
        System.out.println(feast("brown bear", "bear claw"));
    }

    /**
     * All of the animals are having a feast! Each animal is bringing one dish.
     * There is just one rule: the dish must start and end with the same letters
     * as the animal's name. For example, the great blue heron is bringing garlic
     * naan and the chickadee is bringing chocolate cake.
     * <p>
     * Write a function feast that takes the animal's name and dish as arguments
     * and returns true or false to indicate whether the beast is allowed to bring
     * the dish to the feast.
     * <p>
     * Assume that beast and dish are always lowercase strings, and that each has
     * at least two letters. beast and dish may contain hyphens and spaces, but
     * these will not appear at the beginning or end of the string. They will not
     * contain numerals.
     */
    private static boolean feast(String beast, String dish) {
        return beast.toCharArray()[0] == dish.toCharArray()[0]
                && beast.toCharArray()[beast.length() - 1] == dish.toCharArray()[dish.length() - 1];
    }
}