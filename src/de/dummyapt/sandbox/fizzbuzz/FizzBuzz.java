package de.dummyapt.sandbox.fizzbuzz;

import java.util.Scanner;

final class FizzBuzz {
    public static void main(String[] args) {
        System.out.print("Please give me a number: ");
        var numberInput = new Scanner(System.in).nextInt();
        var a = 3;
        var b = 5;

        for (var i = 0; i <= numberInput; i++) {
            var output = "";
            if (i % a != 0 || i % b != 0)
                output = String.valueOf(i);
            if (i % a == 0)
                output = "Fizz";
            if (i % b == 0)
                output = "Buzz";
            if (i % a == 0 && i % b == 0)
                output = "FizzBuzz";
            System.out.println(output);
        }
    }
}