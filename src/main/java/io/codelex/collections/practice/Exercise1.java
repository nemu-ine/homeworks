package io.codelex.collections.practice;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println(arrayList);

        //todo - replace array with a HashSet and print out the results
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(array));
        System.out.println(hashSet);

        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        String[][] array2 = {
                {"Audi", "Germany"},
                {"BMW", "Germany"},
                {"Honda", "Japan"},
                {"Mercedes", "Germany"},
                {"VolksWagen", "Germany"},
                {"Tesla", "USA"}
        };
        HashMap<String, String> hashMap = new HashMap<>();
        for (String[] values : array2) {
            hashMap.put(values[0], values[1]);
        }
        System.out.println(hashMap);
    }
}
