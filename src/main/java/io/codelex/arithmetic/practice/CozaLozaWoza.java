package io.codelex.arithmetic.practice;

public class CozaLozaWoza {

    public static void main(String[] args) {

        for (int i = 1; i <= 110; i++) {
            if (i % 11 == 1 && i != 1) {
                System.out.print('\n');
            }
            if (i % 3 == 0) {
                System.out.print("Coza");
            }
            if (i % 5 == 0) {
                System.out.print("Loza");
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
            }
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                System.out.print(' ');
                continue;
            }
            System.out.print(i + " ");

        }

    }

}
