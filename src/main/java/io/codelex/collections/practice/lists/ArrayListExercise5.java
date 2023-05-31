package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("Duplicates")
public class ArrayListExercise5 {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Violet");
        colors.add("White");
        colors.add("Black");

        System.out.println(colors);

        colors.set(2, "Yellow");
        //TODO: Change the third element with "Yellow"

        System.out.println(colors);
    }

}
