package io.codelex.tests.firstTest.exercise4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import java.util.Scanner;

public class reverseFileContent {

    //public static Scanner input = new Scanner(System.in);
    public static String path, line, reversedTitle;
    public static List<String> list = new ArrayList<>();
    public static File file, outputFile;

    public static void main(String[] args) throws IOException {
        readFile();
        reverseContent();
        reverseTitle();
        createReversedFile();
    }

    public static void readFile() throws IOException {
        /*
        System.out.println("Path to file: (type \"end\" to exit");
        path = input.nextLine();
        if (path.equals("end")) {
            System.exit(0);
        }
        */

        //unfortunately, this depends on the project folder being named homeworks. it is what it is
        path = "../homeworks/src/main/java/io/codelex/tests/firstTest/exercise4/testTextFile";
        BufferedReader bReader = new BufferedReader(new FileReader(path));
        file = new File(path);
        while ((line = bReader.readLine()) != null) list.add(line);
        bReader.close();
    }

    public static void reverseContent() {
        Collections.reverse(list);
    }

    public static void reverseTitle() {
        reversedTitle = new StringBuilder()
                .append(file.getName())
                .reverse()
                .toString();
    }

    public static void createReversedFile() throws IOException {
        outputFile = new File(file.getParent(), reversedTitle);
        BufferedWriter newFile = new BufferedWriter(new FileWriter(outputFile));
        newFile.write(String.join("\n", list));
        newFile.close();
    }

}
