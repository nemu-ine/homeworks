package io.codelex.typesandvariables.practice;

public class Exercise5 {

    public static void main(String[] args) {
        String[] classes = {"test1", "asoniusad", "239048230", "zmsdfdodisz", "98c325b3q"};
        String[] teachers = {"zxcnuj", "564v", "2498n", "212134123", "6544wb76"};
        outputTextTable(classes, teachers);
    }

    public static void outputTextTable (String[] arr, String[] arr2) {
        byte longestText = longestStringValue(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ".repeat(longestText - arr[i].length() + 2) + arr2[i]);
        }
    }

    public static byte longestStringValue (String[] text) {
        byte value = 0;
        for (String x : text) {
            if (x.length() > value) {
                value =  (byte) x.length();
            }
        }
        return value;
    }

}
