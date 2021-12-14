package de.dummyapt.java_sandbox.simplechattybot;

import java.util.Scanner;

final class SimpleChattyBot {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        greet();
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    private static void greet() {
        printf("Hello! My name is %s.%n", "Dummy");
        printf("I was created in %s.%n", "2021");
        print("Please, remind me your name.");
    }

    private static void remindName() {
        var name = SCANNER.nextLine();
        printf("What a great name you have, %s!%n", name);
    }

    private static void guessAge() {
        print("Let me guess your age.");
        print("Enter remainders of dividing your age by 3, 5 and 7.");
        var rem3 = SCANNER.nextInt();
        var rem5 = SCANNER.nextInt();
        var rem7 = SCANNER.nextInt();
        var age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        printf("Your age is %s; that's a good time to start programming!%n", age);
    }

    private static void count() {
        print("Now I will prove to you that I can count to any number you want.");
        var num = SCANNER.nextInt();
        for (var i = 0; i <= num; i++) {
            print(i);
        }
    }

    private static void test() {
        print("Let's test your programming knowledge.");
        print("Why do we use methods?");
        print("1. To repeat a statement multiple times.");
        print("2. To decompose a program into several small subroutines.");
        print("3. To determine the execution time of a program.");
        print("4. To interrupt the execution of a program.");
        if (SCANNER.nextInt() == 2)
            print("Well done!");
        else
            print("Please, try again.");
    }

    private static void end() {
        print("Congratulations, have a nice day!");
    }

    private static void print(Object s) {
        System.out.println(s);
    }

    private static void printf(String s, Object value) {
        System.out.printf(s, value);
    }
}