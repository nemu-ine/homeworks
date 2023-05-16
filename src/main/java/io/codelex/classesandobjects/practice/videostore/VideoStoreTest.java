package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;
    private static final VideoStore videostore = new VideoStore();

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose the operation you want to perform:");
            System.out.println("Choose 0 to EXIT");
            System.out.println("Choose 1 to list the inventory");
            System.out.println("Choose 2 to fill video store");
            System.out.println("Choose 3 to rent video (as user)");
            System.out.println("Choose 4 to return video (as user)");
            System.out.println("Choose 5 to rate a video (as user)\n");

            int n = keyboard.nextInt();
            keyboard.nextLine();

            switch (n) {
                case 0 -> {keyboard.close(); System.exit(0);}
                case 1 -> videostore.listInventory();
                case 2 -> fillVideoStore(keyboard);
                case 3 -> rentVideo(keyboard);
                case 4 -> returnVideo(keyboard);
                case 5 -> rateVideo(keyboard);
            }

        }

    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = scanner.nextLine();
            System.out.println("Enter rating");
            int rating = scanner.nextInt();
            videostore.addVideo(movieName);
            videostore.rateVideo(movieName, rating);
            scanner.nextLine();
        }
    }

    private static void rentVideo(Scanner scanner) {
        String line = scanner.nextLine();
        videostore.checkoutVideo(line);
    }

    private static void returnVideo(Scanner scanner) {
        String line = scanner.nextLine();
        videostore.returnVideo(line);
    }

    private static void rateVideo(Scanner scanner) {
        String line = scanner.nextLine();
        int rating = scanner.nextInt();
        videostore.rateVideo(line, rating);
    }
}
