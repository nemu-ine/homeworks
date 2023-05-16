package io.codelex.arrays.practice;

import java.util.Arrays;

public class Exercise1 {

    public static void main(String[] args) {

        int[] myArray1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        String[] myArray2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };


        System.out.println("Original numeric array : " + Arrays.toString(myArray1));
        int[] newNumArray = sortArray(myArray1);
        System.out.println("Sorted numeric array : " + Arrays.toString(newNumArray));

        System.out.println("Original string array : " + Arrays.toString(myArray2));
        String[] newStringArray = sortArray(myArray2);
        System.out.println("Sorted string array : " + Arrays.toString(newStringArray));

    }

    public static int[] sortArray (int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static String[] sortArray (String[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}
