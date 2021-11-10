package de.dummyapt.sandbox.codewars;

public class BasicOperations {
    public static void main(String[] args) {
        System.out.println(basicMath("+", 10, 5));
        System.out.println(basicMath("-", 10, 5));
        System.out.println(basicMath("*", 10, 5));
        System.out.println(basicMath("/", 10, 5));
    }

    /**
     * Your task is to create a function that does four basic mathematical operations.
     * <p>
     * The function should take three arguments - operation(string/char), value1(number), value2(number).
     * The function should return result of numbers after applying the chosen operation.
     *
     * @param op Operator
     * @param v1 First value
     * @param v2 Second value
     * @return Result
     */
    public static Integer basicMath(String op, int v1, int v2) {
        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> v1 / v2;
            default -> 0;
        };
    }
}
