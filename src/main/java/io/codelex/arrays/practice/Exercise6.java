package io.codelex.arrays.practice;

import java.util.Random;

public class Exercise6 {

    public static void main(String[] args) {

        int[] myArray1 = createRandomArray();
        int[] myArray2 = cloneArray(myArray1);
        myArray1[9] = -7;
        displayValues(myArray1, myArray2);

    }


    public static int[] createRandomArray () {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }
        return arr;
    }
    public static int[] cloneArray (int[] arr) {
        int[] temp = new int[arr.length];
        System.arraycopy(arr, 0, temp, 0, temp.length);
        return temp;
    }

    public static void displayValues(int[] arr, int[] arr2) {
        StringBuilder line1 = new StringBuilder("Array 1:");
        StringBuilder line2 = new StringBuilder("Array 2:");
        for (int i = 0; i < arr.length; i++) {
            line1.append(" ").append(arr[i]);
            line2.append(" ").append(arr2[i]);
        }
        System.out.println(line1 + "\n" + line2);
    }

}
