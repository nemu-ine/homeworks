package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];
    private static boolean isTie = false, winnerFound = false;
    private static int x, y;
    private static char player;

    public static void main(String[] args) {
        initBoard();
        displayBoard();
        runGame();
        outputResult();
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static void runGame() {
        int moveCount = 0;
        Scanner keyboard = new Scanner(System.in);
        while (moveCount < 9 && !winnerFound) {
            player = (moveCount % 2 == 0) ? 'X' : 'O';
            System.out.print("'" + player + "', choose your location (row, column): ");
            String location = keyboard.nextLine();
            while (!validate(location)) {
                location = keyboard.nextLine();
            }
            board[x][y] = player;
            displayBoard();
            if (moveCount > 3) {
                winnerFound = calculateWinner();
                if (winnerFound) {
                    break;
                }
            }
            moveCount++;
        }
        keyboard.close();
        if (!winnerFound) {
            isTie = true;
        }
    }

    public static boolean validate (String line) {
        boolean value = false;
        String[] temp = line.split(" ");
        try {
            x = Integer.parseInt(temp[0]); y = Integer.parseInt(temp[1]);
            if (x < 3 && y < 3 && board[x][y] == ' ') {
                value = true;
            } else {
                System.out.print("You can't select this field. (row, column): ");
            }
        } catch (Exception e) {
            System.out.print("Invalid input. (row, column): ");
        }
        return value;
    }
    public static void outputResult() {
        if (isTie) {
            System.out.println("The game is a tie.");
        } else {
            System.out.println(player + " won.");
        }
    }

    public static boolean calculateWinner() {
        return horizontalWin() || verticalWin() || diagonalWin();
    }

    public static boolean horizontalWin() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != player) {
                    break;
                }
                if (j == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean verticalWin() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[j][i] != player) {
                    break;
                }
                if (j == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean diagonalWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][i] != player) {
                break;
            }
            if (i == 2) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (board[i][2-i] != player) {
                break;
            }
            if (i == 2) {
                return true;
            }
        }
        return false;
    }
}