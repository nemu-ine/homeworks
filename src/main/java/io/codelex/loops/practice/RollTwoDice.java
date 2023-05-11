package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {

    public static void main(String[] args) {

        int desiredSum;
        int x = 0, y = 0;

        System.out.print("Desired sum (2-12): ");
        Scanner input = new Scanner(System.in);
        desiredSum = input.nextInt();
        while (desiredSum < 2 || desiredSum > 12) {
            System.out.print("Enter from 2 to 12. Desired sum: ");
            desiredSum = input.nextInt();
        }
        input.close();
        Random rand = new Random();
        while (x + y != desiredSum) {
            x = rand.nextInt(6) + 1;
            y = rand.nextInt(6) + 1;
            System.out.println(x + " and " + y + " = " + (x + y));
        }

    }

}
