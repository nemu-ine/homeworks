package io.codelex.classesandobjects.practice.videostore;

import java.util.HashMap;

public class VideoStore {

    private HashMap<String, Video> inventory;

    public VideoStore() {
        this.inventory = new HashMap<>();
    }

    public void addVideo(String title) {
        if (title == "#") {
            return;
        }
        Video video = new Video(title);
        inventory.put(title, video);
        System.out.println(title + " has been added to the inventory.");
    }

    public void checkoutVideo(String title) {
        Video video = inventory.get(title);
        if (video == null) {
            System.out.println("Video is not in the inventory.");
            return;
        }
        video.checkOut();
    }

    public void returnVideo(String title) {
        Video video = inventory.get(title);
        if (video == null) {
            System.out.println("Video is not in the inventory.");
            return;
        }
        video.returnVideo();
    }

    public void rateVideo(String title, int rating) {
        if (title == "#") {
            return;
        }
        Video video = inventory.get(title);
        if (video == null) {
            System.out.println("Video is not in the inventory.");
            return;
        }
        video.giveRating(rating);
    }

    public void listInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is currently empty");
            return;
        }
        System.out.println("Current inventory:");
        for (Video video : inventory.values()) {
            System.out.println(video.getTitle() + " (Rating: " + video.getAverageRating() + ") (Available? : " + video.isCheckedOut() + ")");
        }
    }

}
