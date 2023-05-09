package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        System.out.println("Write something and it will count uppercase letter amount");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine().replaceAll("[^a-zA-Z]", "");
        input.close();
        String uppercaseText = text.toUpperCase();
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == uppercaseText.charAt(i)) {
                sum++;
            }
        }
        System.out.println(sum);
    }

}
