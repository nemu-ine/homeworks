package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] keypadLetters = input.nextLine().toLowerCase().split(" ");
        input.close();
        StringBuilder formatString = new StringBuilder();
        for (String x : keypadLetters) {
            formatString.append(x.replaceAll("[^a-zA-Z]", ""));
        }
        StringBuilder keypadNumbers = new StringBuilder();
            for (char x : formatString.toString().toCharArray()) {
            switch (x) {
                case 'a', 'b', 'c' -> keypadNumbers.append(getSequence("2", 96, x));
                case 'd', 'e', 'f' -> keypadNumbers.append(getSequence("3", 99, x));
                case 'g', 'h', 'i' -> keypadNumbers.append(getSequence("4", 102, x));
                case 'j', 'k', 'l' -> keypadNumbers.append(getSequence("5", 105, x));
                case 'm', 'n', 'o' -> keypadNumbers.append(getSequence("6", 108, x));
                case 'p', 'q', 'r', 's' -> keypadNumbers.append(getSequence("7", 111, x));
                case 't', 'u', 'v' -> keypadNumbers.append(getSequence("8", 115, x));
                case 'w', 'x', 'y', 'z' -> keypadNumbers.append(getSequence("9", 118, x));
            }
        }
        System.out.println(keypadNumbers);
    }

    public static String getSequence (String value, int asciiTableValue, char currentChar) {
        return value.repeat( - (asciiTableValue - currentChar) ) + " ";
    }


}
