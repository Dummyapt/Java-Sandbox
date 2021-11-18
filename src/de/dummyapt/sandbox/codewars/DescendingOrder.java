package de.dummyapt.sandbox.codewars;

import java.util.Comparator;
import java.util.stream.Collectors;

final class DescendingOrder {
    public static void main(String[] args) {
        System.out.println(sortDesc(492345));
    }

    /**
     * Your task is to make a function that can take
     * any non-negative integer as an argument and return
     * it with its digits in descending order.
     * Essentially, rearrange the digits to create the
     * highest possible number.
     * <p>
     * Examples:
     * Input: 42145
     * Output: 54421
     * <p>
     * Input: 145263
     * Output: 654321
     * <p>
     * Input: 123456789 Output: 987654321
     *
     * @param num Number to be re-ordered
     * @return Descended number
     */
    private static int sortDesc(final int num) {
        return Integer.parseInt(
                String.valueOf(num)
                        .chars()
                        .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.joining()));
    }
}