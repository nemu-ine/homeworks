package io.codelex.classesandobjects.practice.videostore;

public class Video {

    private String title;
    private boolean isCheckedOut;
    private double averageRating;
    private int usersRated;

    public Video(String title) {
        this.title = title;
        this.isCheckedOut = false;
        this.averageRating = 0.0;
        this.usersRated = 0;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isCheckedOut() {
        return this.isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.isCheckedOut = checkedOut;
    }

    public double getAverageRating() {
        return this.averageRating;
    }

    public void giveRating(double rating) {
        if (rating > 10) {
            rating = 10;
        }
        if (averageRating != 0) {
            this.averageRating = (this.averageRating + rating) / this.usersRated;
        } else {
            this.averageRating = rating;
        }
        this.usersRated++;
        System.out.println("Rating given successfully.");
    }

    public void checkOut() {
        if (this.isCheckedOut) {
            System.out.println("The video is already checked out.");
        } else {
            this.isCheckedOut = true;
            System.out.println("Video checked out successfully.");
        }
    }

    public void returnVideo() {
        if (this.isCheckedOut) {
            this.isCheckedOut = false;
            System.out.println("Video returned successfully.");
        } else {
            System.out.println("The video is not currently checked out.");
        }
    }

}
