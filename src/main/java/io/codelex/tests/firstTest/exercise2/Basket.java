package io.codelex.tests.firstTest.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    private final List<T> items = new ArrayList<>();

    public void addToBasket(T item) throws BasketFullException {
        if (item == null) {
            return;
        }
        if (items.size() == 10) {
            throw new BasketFullException();
        }
        items.add(item);
    }

    public void removeFromBasket() throws BasketEmptyException {
        if (items.size() == 0) {
            throw new BasketEmptyException();
        }
        items.remove(0);
    }

    public int getSize() {
        return items.size();
    }

}
