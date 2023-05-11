package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {

    public static void main(String[] args) {

        int min, max, maxLoop;
        Scanner input = new Scanner(System.in);
        System.out.print("Min? ");
        min = input.nextInt();
        System.out.print("Max? ");
        max = input.nextInt();
        input.close();

        maxLoop = (max - min);

        for (int i = min; i <= max; i++) { // 1 2 3 4 5
            for (int j = i, k = 0; k <= maxLoop; j++, k++) { // 2 3 4 5 1
                if (j > max) {
                    j = min;
                }
                System.out.print(j);
            }
            System.out.print('\n');
        }


    }

}
