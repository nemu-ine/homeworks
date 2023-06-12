package io.codelex.oop.summary.generics.exercise2;

public abstract class AbstractItem implements Item {

    private String name;
    private double price;

    public AbstractItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getFullInfo();

}
