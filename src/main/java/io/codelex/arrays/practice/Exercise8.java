package io.codelex.arrays.practice;

import java.util.Random;
import java.util.Scanner;

public class Exercise8 {

    private static final String[] listOfWords = {
            "cool", "alcoholic", "bathe", "ignore", "wind", "wretched",
            "attempt", "babies", "narrow", "doctor", "mist", "statuesque",
            "furniture", "detailed", "celery", "income", "shoes", "threatening",
            "shelter", "soap", "caption", "glue", "texture", "dark",
            "round", "stare", "quicksand", "truthful", "oval", "remember",
            "shy", "tricky", "post", "plate", "wreck", "bedroom",
            "naive", "switch", "jump", "stage", "shelf", "courageous",
            "harass", "cold", "illustrious", "chew", "cooperative", "night",
            "crook", "pail", "system", "calendar", "inform", "omniscient",
            "unnatural", "reflect", "fast", "attractive", "rambunctious", "sofa"
    };
    private static final int maxGuesses = 18;
    private static final char[] allowedGuess = {
            'q', 'w', 'e', 'r', 't', 'y',
            'u', 'i', 'o', 'p', 'a', 's',
            'd', 'f', 'g', 'h', 'j', 'k',
            'l', 'z', 'x', 'c', 'v', 'b',
            'n', 'm'
    };
    private static boolean hasWon = false;
    private static String secretWord, displayWord, guessedChars = "";

    public static void main(String[] args) {
        getSecretWord();
        runGame();
        outputResult();
    }

    public static void getSecretWord() {
        Random rand = new Random();
        secretWord = listOfWords[rand.nextInt(60)];
        displayWord = "_".repeat(secretWord.length());
    }

    public static void runGame() {
        int turn = 0;
        Scanner input = new Scanner(System.in);
        while (turn < maxGuesses || !hasWon) {
            terminalOutput();
            String guessedChar = input.nextLine().toLowerCase();
            while (!checkIfCharUnused(guessedChar)) {
                System.out.print("The char used is either in use or invalid, please try again: ");
                guessedChar = input.nextLine().toLowerCase();
            }
            updateDisplayWord(guessedChar);
            if (checkWinner()) {
                hasWon = true;
                break;
            }
            turn++;
        }
        input.close();
    }

    public static void terminalOutput() {
        final String topLine = "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-";
        final String secondLine = "Word:";
        final String thirdLine = "Misses:";
        final String fourthLine = "Guess";
        System.out.print(topLine + "\n" +
                           secondLine + " ".repeat(8 - secondLine.length()) + formatWord() + "\n" +
                           thirdLine + " ".repeat(8 - thirdLine.length()) + missedChars() + "\n" +
                           fourthLine + " ".repeat(8 - fourthLine.length()));
    }

    public static String formatWord() {
        StringBuilder returnString = new StringBuilder();
        for (char x : displayWord.toCharArray()) {
            returnString.append(x).append(" ");
        }
        return returnString.toString().trim();
    }

    public static String missedChars() {
        StringBuilder returnString = new StringBuilder();
        for (char x : guessedChars.toCharArray()) {
            if (!secretWord.contains(String.valueOf(x))) {
                returnString.append(x).append(" ");
            }
        }
        return returnString.toString();
    }

    public static boolean checkIfCharUnused (String line) {
        try {
            for (int i = 0; i < allowedGuess.length; i++) {
                if (line.charAt(0) == allowedGuess[i]) {
                    break;
                }
                if (i == allowedGuess.length - 1) {
                    return false;
                }
            }
            if (!guessedChars.contains(String.valueOf(line.charAt(0)))) {
                guessedChars += line.charAt(0);
                return true;
            }
        } catch (Exception e) {
            System.out.println("You submitted an empty string.");
        }
        return false;
    }


    public static void updateDisplayWord(String line) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < secretWord.length(); i++) {
            if (line.charAt(0) == secretWord.charAt(i)) {
                newString.append(line.charAt(0));
            } else {
                newString.append(displayWord.charAt(i));
            }
        }
        displayWord = newString.toString();
    }

    public static boolean checkWinner() {
        return secretWord.equals(displayWord);
    }
    public static void outputResult() {
        if (hasWon) {
            System.out.println("YOU GOT IT!");
        } else {
            System.out.println("You have lost.");
        }
    }

}