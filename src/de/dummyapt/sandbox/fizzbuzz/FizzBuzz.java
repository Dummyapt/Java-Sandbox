package de.dummyapt.sandbox.fizzbuzz;

import java.util.Scanner;

class FizzBuzz {
    FizzBuzz() {
        System.out.print("Please give me a number: ");
        var numberInput = new Scanner(System.in).nextInt();

        var a = 3;
        var b = 5;

        for (var i = 0; i <= numberInput; i++) {
            var output = "";
            if (i % a != 0 || i % b != 0)
                output = Integer.toString(i);
            if (i % a == 0)
                output = "Java";
            if (i % b == 0)
                output = "Script";
            if (i % a == 0 && i % b == 0)
                output = "JavaScript";
            System.out.println(output);
        }
    }

    public static void main(String[] args) {
        new FizzBuzz();
    }
}