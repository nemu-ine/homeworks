package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Piglet {

    public static void main(String[] args) {

        System.out.println("Welcome to Piglet!");
        int points = rollDice();
        System.out.println("You got " + points + " points.");

    }

    public static int rollDice() {
        int value = 0;
        boolean rollAgain = true;
        Random rand = new Random();
        while (rollAgain) {
            int diceValue = rand.nextInt(6) + 1;
            System.out.println("You rolled a " + diceValue + "!");
            if (diceValue == 1) {
                return 0;
            } else {
                rollAgain = readBoolean();
                value += diceValue;
            }
        }
        return value;
    }

    public static boolean readBoolean() {
        System.out.print("Roll again? ");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        return answer.charAt(0) == 'y';
    }

}
