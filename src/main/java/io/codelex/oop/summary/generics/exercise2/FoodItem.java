package io.codelex.oop.summary.generics.exercise2;

import java.text.DecimalFormat;

public class FoodItem extends AbstractItem {

    private String bestBefore;

    public FoodItem(String name, double price, String bestBefore) {
        super(name, price);
        this.bestBefore = bestBefore;
    }

    public String getBestBefore() {
        return bestBefore;
    }

    public String getFullInfo() {
        DecimalFormat df = new DecimalFormat("0.00");
        return getName() + ", " + df.format(getPrice()) + " EUR, best before: " + bestBefore;
    }

}
