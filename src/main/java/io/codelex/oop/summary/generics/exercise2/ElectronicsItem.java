package io.codelex.oop.summary.generics.exercise2;

import java.text.DecimalFormat;

public class ElectronicsItem extends AbstractItem {

    private int power;

    public ElectronicsItem(String name, double price, int power) {
        super(name, price);
        this.power = power;
    }

    public String getFullInfo() {
        DecimalFormat df = new DecimalFormat("0.00");
        return getName() + ", " + df.format(getPrice()) + " EUR, power: " + power + "W";
    }

}
