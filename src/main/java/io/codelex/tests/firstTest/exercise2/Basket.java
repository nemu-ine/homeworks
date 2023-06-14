package io.codelex.tests.firstTest.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    private final List<T> items = new ArrayList<>();
    private int currentSize = 0;

    public void addToBasket(T item) throws BasketFullException {
        if (item == null) {
            return;
        }
        if (currentSize == 10) {
            throw new BasketFullException();
        }
        items.add(item);
        currentSize++;
    }

    public void removeFromBasket() throws BasketEmptyException {
        if (currentSize == 0) {
            throw new BasketEmptyException();
        }
        items.remove(0);
        currentSize--;
    }

    public int getSize() {
        return currentSize;
    }

}
