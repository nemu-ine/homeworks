package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        System.out.print("Max value? ");
        Scanner input = new Scanner(System.in);
        int maxValue = input.nextInt();
        input.close();

        for (int i = 1; i <= maxValue; i++) {
            if (i % 20 == 1 && i != 1) {
                System.out.print('\n');
            }
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(' ');
                continue;
            }
            System.out.print(i + " ");

        }

    }

}
