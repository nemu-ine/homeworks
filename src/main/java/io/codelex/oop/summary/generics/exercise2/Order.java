package io.codelex.oop.summary.generics.exercise2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private final List<SellableThing> items;
    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(SellableThing item) {
        if (item instanceof FoodItem foodItem) {
            LocalDate today = LocalDate.now();
            LocalDate expirationDate = LocalDate.parse(foodItem.getBestBefore(), dtf);
            if (expirationDate.isBefore(today)) {
                throw new BadFoodException("Food is expired");
            }
        }
        items.add(item);
    }

    public List getItems() {
        return items;
    }

}
