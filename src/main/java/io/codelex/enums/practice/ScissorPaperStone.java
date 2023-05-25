package io.codelex.enums.practice;

import java.util.Random;
import java.util.Scanner;

public enum ScissorPaperStone {
    SCISSORS,
    STONE,
    PAPER;

    private static int currentRound = 0, maxRounds;
    private static int playerWins = 0, computerWins = 0;
    private static boolean quit = false;
    private static Scanner input;
    private static ScissorPaperStone playerChoice, computerChoice;

    public static void start() {
        ScissorPaperStone.input = new Scanner(System.in);
        System.out.print("Let us begin... \nHow many rounds? ");
        ScissorPaperStone.maxRounds = input.nextInt();
        while (ScissorPaperStone.maxRounds < 1) {
            System.out.print("Not a valid value, enter again: ");
            ScissorPaperStone.maxRounds = input.nextInt();
        }
        ScissorPaperStone.game();
        ScissorPaperStone.getResults();
        ScissorPaperStone.input.close();
    }

    private static void game() {
        ScissorPaperStone.input.nextLine();
        while (ScissorPaperStone.currentRound < ScissorPaperStone.maxRounds && !ScissorPaperStone.quit) {
            ScissorPaperStone.selectMove();
            if (!ScissorPaperStone.quit) {
                ScissorPaperStone.currentRound++;
                ScissorPaperStone.computerMove();
                ScissorPaperStone.calculateWinner();
            }
        }
    }

    private static void selectMove() {
        System.out.println("Scissor-Paper-Stone \n   Your turn (Enter s for scissor, p for paper, t for stone, q to quit");
        loop: while (!ScissorPaperStone.quit) {
            String in = ScissorPaperStone.input.nextLine();
            switch (in) {
                case "s" -> {
                    ScissorPaperStone.playerChoice = ScissorPaperStone.SCISSORS;
                    break loop;
                }
                case "p" -> {
                    ScissorPaperStone.playerChoice = ScissorPaperStone.PAPER;
                    break loop;
                }
                case "t" -> {
                    ScissorPaperStone.playerChoice = ScissorPaperStone.STONE;
                    break loop;
                }
                case "q" -> {
                    System.out.println("Quitting...");
                    ScissorPaperStone.quit();
                }
                default -> System.out.println("Invalid input, try again...");
            }
        }
    }

    private static void computerMove() {
        Random rand = new Random();
        int randChoice = rand.nextInt(3);
        switch (randChoice) {
            case 0 -> ScissorPaperStone.computerChoice = SCISSORS;
            case 1 -> ScissorPaperStone.computerChoice = PAPER;
            case 2 -> ScissorPaperStone.computerChoice = STONE;
        }
        System.out.println("My turn: " + ScissorPaperStone.computerChoice);
    }

    private static void calculateWinner() {
        if (ScissorPaperStone.playerChoice == ScissorPaperStone.computerChoice) {
            System.out.println("Tie!");
        } else {
            switch (ScissorPaperStone.playerChoice) {
                case STONE -> validateWin(ScissorPaperStone.STONE);
                case PAPER -> validateWin(ScissorPaperStone.PAPER);
                case SCISSORS -> validateWin(ScissorPaperStone.SCISSORS);
            }
        }
        System.out.println();
    }

    private static void validateWin(ScissorPaperStone choice) {
        if (choice == ScissorPaperStone.STONE) {
            if (ScissorPaperStone.computerChoice == ScissorPaperStone.PAPER) {
                addWin("computer");
            } else {
                addWin("player");
            }
        }

        if (choice == ScissorPaperStone.PAPER) {
            if (ScissorPaperStone.computerChoice == ScissorPaperStone.SCISSORS) {
                addWin("computer");
            } else {
                addWin("player");
            }
        }

        if (choice == ScissorPaperStone.SCISSORS) {
            if (ScissorPaperStone.computerChoice == ScissorPaperStone.STONE) {
                addWin("computer");
            } else {
                addWin("player");
            }
        }
    }

    private static void addWin(String val) {
        if (val.equals("player")) {
            ScissorPaperStone.playerWins++;
            System.out.println("You won!");
        } else {
            ScissorPaperStone.computerWins++;
            System.out.println(ScissorPaperStone.computerChoice + " beats " + ScissorPaperStone.playerChoice + ", I won!");
        }
    }

    private static void getResults() {
        System.out.println("Number of rounds: " + ScissorPaperStone.currentRound);
        System.out.println("You won " + ScissorPaperStone.playerWins + " (" + ((float) ScissorPaperStone.playerWins / ScissorPaperStone.currentRound) * 100 + "%) " +
                           "I won " + ScissorPaperStone.computerWins + " (" + ((float) ScissorPaperStone.computerWins / ScissorPaperStone.currentRound) * 100 + "%)");
    }

    private static void quit() {
        ScissorPaperStone.quit = true;
    }

}
