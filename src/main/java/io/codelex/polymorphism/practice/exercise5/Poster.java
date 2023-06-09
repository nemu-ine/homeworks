package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {

    private double width, height;
    private int numberOfCopies, costPerCopy;

    Poster (int fee, double width, double height, int numberOfCopies) {
        super(fee);
        this.width = width; //centimeters
        this.height = height; //centimeters
        this.numberOfCopies = numberOfCopies;
        this.costPerCopy = (int) ((width * height) * 1.35);
    }

    public int cost() {
        return super.cost() + numberOfCopies * costPerCopy;
    }

    public String toString() {
        return super.toString() + " Poster: Width=" + width + " Height=" + height + " NumberOfCopies=" + numberOfCopies + " CostPerCopy=" + costPerCopy + "\n";
    }

}
