package io.codelex.oop.summary.generics.exercise2;

import java.text.DecimalFormat;

public class HouseholdItem extends AbstractItem {

    private String color;

    public HouseholdItem(String name, double price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getFullInfo() {
        DecimalFormat df = new DecimalFormat("0.00");
        return getName() + ", " + df.format(getPrice()) + " EUR, color: " + color;
    }

}
