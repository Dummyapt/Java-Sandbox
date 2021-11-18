package de.dummyapt.sandbox.codewars;

final class RemoveChars {
    public static void main(String[] args) {
        System.out.println(remove("Test"));
        System.out.println(remove("I love cats"));
    }

    /**
     * It's pretty straightforward.
     * Your goal is to create a function that removes the first
     * and last characters of a string. You're given one parameter,
     * the original string. You don't have to worry with strings
     * with less than two characters.
     *
     * @param s Text
     * @return String with the first and last letters removed
     */
    private static String remove(String s) {
        return String.valueOf(
                new StringBuilder(s).replace(0, 1, "").replace(s.length() - 2, s.length() - 1, "")
        ).trim();
    }
}