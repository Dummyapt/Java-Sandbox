package de.dummyapt.sandbox.funwitharrays;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

final class FunWithArrays {
    private static int[] NUMBERS;

    public FunWithArrays(int pLength, int pMaxNum) {
        NUMBERS = new int[pLength];
        for (var i = 0; i < NUMBERS.length; i++)
            NUMBERS[i] = new Random().nextInt() * pMaxNum;
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        println("Dear fellow,");
        println("please enter the size of your beloved array: ");

        var size = scanner.nextInt();

        println("Okay, dear fellow, the size of your array will be " + size + ", as you wish.");
        println("Now choose your favorite maximum number: ");

        var max = scanner.nextInt();

        println(max + " is a great choice. Your random number array will be generated.");

        new FunWithArrays(size, max);

        println("Your number-array is now crafted and at your disposal.");
        println("______________________________________________________");

        while (true) {
            println("");
            println("Please tell me your wishes and I will fulfill your desire.");
            println("\t 1) Search for a given number.");
            println("\t 2) Print all positions of a given number.");
            println("\t 3) Print the whole array.");
            println("\t 4) Exit and leave me in desperate tears.");

            switch (scanner.nextInt()) {
                case 1 -> {
                    clear();
                    println("Okay fellow, please tell me the number you are looking for: ");
                    var searchNum = scanner.nextInt();
                    int pos = searchNumPos(searchNum);
                    println("");
                    if (pos == -1)
                        println("Friend, I have no words. It kills me inside to tell you, the number " + searchNum + " was nowhere found inside of your array.");
                    else {
                        println("I am so excited to reveal the position of the number " + searchNum);
                        println("It is at index " + pos);
                    }
                }
                case 2 -> {
                    clear();
                    println("Please let me know, which is the number of your dreams: ");
                    var num = scanner.nextInt();
                    println("The number " + num + " can be found at following positions:");
                    showAllNumPos(num);
                }
                case 3 -> {
                    clear();
                    printArray();
                }
                case 4 -> {
                    clear();
                    println("How could you do this to me? I will suffer eternal grief at digital nirvana.");
                    System.exit(0);
                }
                default -> {
                    clear();
                    println("I am inconsolable, I was unable to interpret your wish.");
                    println("Please be patient with your humble servant and give it another try.");
                }
            }
        }
    }

    private static int searchNumPos(int pNumber) {
        for (var i = 0; i < NUMBERS.length; i++)
            if (NUMBERS[i] == pNumber)
                return i;
        return -1;
    }

    private static void showAllNumPos(int pNumber) {
        for (var i = 0; i < NUMBERS.length; i++)
            if (NUMBERS[i] == pNumber)
                print(i + " ");
    }

    private static void printArray() {
        for (var i = 0; i < NUMBERS.length; i++)
            println("numbers[" + i + "] = " + NUMBERS[i]);
    }

    private static void clear() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void print(String s) {
        System.out.print(s);
    }

    private static void println(String s) {
        System.out.println(s);
    }
}