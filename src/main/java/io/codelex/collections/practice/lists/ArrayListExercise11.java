package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

        //TODO: Create an ArrayList with String elements
        ArrayList<String> arrayList = new ArrayList<>();

        //TODO: Add 10 values to list
        arrayList.addAll(Arrays.asList(array));

        //TODO: Add new value at 5th position
        arrayList.add(4, "new");

        //TODO: Change value at last position (Calculate last position programmatically)
        arrayList.set(arrayList.size() - 1, "changed");

        //TODO: Sort your list in alphabetical order
        Collections.sort(arrayList);

        //TODO: Check if your list contains "Foobar" element
        System.out.println(arrayList.contains("Foobar"));

        //TODO: Print each element of list using loop
        for (String str : arrayList) {
            System.out.println(str);
        }
    }

}
