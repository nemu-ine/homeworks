package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word:");
        String firstWord = input.nextLine();
        System.out.println("Enter second word:");
        String secondWord = input.nextLine();
        input.close();

        printFormattedText(firstWord, secondWord);

    }

    public static void printFormattedText(String first, String second) {
        System.out.print(first);
        for (int i = 0; i < (30 - (first.length() + second.length())); i++) {
            System.out.print(".");
        }
        System.out.println(second);
    }

}
