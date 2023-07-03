package io.codelex.oop.summary.generics.exercise2;

import java.text.DecimalFormat;

public class ItemPacking implements Service {
    private static final String NAME = "Item packing";
    private static final double PRICE = 5.00;

    public String getName() {
        return NAME;
    }

    public double getPrice() {
        return PRICE;
    }

    public String getFullInfo() {
        DecimalFormat df = new DecimalFormat("0.00");
        return getName() + ", " + df.format(getPrice()) + " EUR";
    }
}
