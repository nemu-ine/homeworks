package io.codelex.arrays.practice;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a min number");
        int minNumber = input.nextInt();

        System.out.println("Please enter a max number");
        int maxNumber = input.nextInt();
        input.close();

        int[] myArray = new int[maxNumber - minNumber + 1];
        int sum = 0;

        for (int i = 0; i <= maxNumber - minNumber; i++) {
            myArray[i] = minNumber + i;
        }
        for (int x : myArray) {
            sum += x;
        }

        System.out.println("The sum is " + sum);
    }
}
