package io.codelex.loops.practice;

import java.util.Scanner;

public class AsciiFigure {

    static final int baseRepeatCount = 4;

    public static void main(String[] args) {

        System.out.print("Enter figure size: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        input.close();
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < size; i++) {
            text.append("/".repeat(baseRepeatCount * (size - i - 1)));
            text.append("*".repeat(2 * baseRepeatCount * i));
            text.append("\\".repeat(baseRepeatCount * (size - i - 1)));
            text.append("\n".repeat((i != size - 1) ? 1 : 0));
        }
        System.out.println(text);
    }

}
