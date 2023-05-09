package io.codelex.arithmetic.practice;

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Random rand = new Random();
        int secret = rand.nextInt(100) + 1;
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        input.close();
        if (guess == secret) {
            System.out.println("You guessed it! What are the odds?!?");
        } else if (guess > secret) {
            System.out.println("Sorry, you are too high. I was thinking of " + secret);
        } else {
            System.out.println("Sorry, you are too low. I was thinking of " + secret);
        }

    }

}
