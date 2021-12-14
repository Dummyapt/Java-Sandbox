package de.dummyapt.java_sandbox.codewars;

final class SumArray {
    public static void main(String[] args) {
        System.out.println(sum(new double[]{}));
        System.out.println(sum(new double[]{-2.398}));
        System.out.println(sum(new double[]{1, 2, 3}));
        System.out.println(sum(new double[]{1.1, 2.2, 3.3}));
        System.out.println(sum(new double[]{1, 5.2, 4, 0, -1}));
        System.out.println(sum(new double[]{30, 89, 100, 101}));
    }

    /**
     * Write a function that takes an array of numbers and returns
     * the sum of the numbers. The numbers can be negative or non-integer.
     * If the array does not contain any numbers then you should return 0.
     * <p>
     * Examples
     * Input: [1, 5.2, 4, 0, -1]
     * Output: 9.2
     * <p>
     * Input: []
     * Output: 0
     * <p>
     * Input: [-2.398]
     * Output: -2.398
     * <p>
     * Assumptions
     * You can assume that you are only given numbers.
     * You cannot assume the size of the array.
     * You can assume that you do get an array and if the array is empty, return 0.
     * Tests expect accuracy of 1e-4.
     *
     * @param numbers Array of numbers
     * @return Sum of all elements in the array
     */
    private static double sum(double[] numbers) {
        double sum = 0;
        for (double i : numbers)
            sum += i;
        return sum;
    }
}