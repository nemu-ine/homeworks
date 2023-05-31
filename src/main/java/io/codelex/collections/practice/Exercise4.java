package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {

    public static Set<String> names = new HashSet<>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter name: ");
            String name = input.nextLine();
            if (name.equals("")) {
                break;
            }
            names.add(name);
        }

        System.out.println("Unique names: " + names);

    }

}
