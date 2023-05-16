package io.codelex.classesandobjects.practice;

public class Product {
    private final String name; private double price; private int amount;

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }

    public void printProduct() {
        System.out.println(name + ", price " + price + ", amount " + amount);
    }

    public void setPrice (double value) {
        this.price = value;
    }

    public void setAmount (int value) {
        this.amount = value;
    }
}
