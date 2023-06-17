package io.codelex.tests.firstTest;

import io.codelex.tests.firstTest.exercise2.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Exercise2Test {

    @Test
    public void createAppleBasket() throws BasketFullException {
        Apple apple = new Apple();
        Basket<Apple> appleBasket = new Basket<>();
        appleBasket.addToBasket(apple);
        assertEquals(appleBasket.getSize(), 1);
    }

    @Test
    public void createMushroomBasket() throws BasketFullException {
        Mushroom mushroom = new Mushroom();
        Basket<Mushroom> mushroomBasket = new Basket<>();
        mushroomBasket.addToBasket(mushroom);
        assertEquals(mushroomBasket.getSize(), 1);
    }

    @Test
    public void expectBasketFullException() {
        assertThrows(BasketFullException.class, () -> {
            Apple apple = new Apple();
            Basket<Apple> appleBasket = new Basket<>();
            for (int i = 0; i < 11; i++) {
                appleBasket.addToBasket(apple);
            }
            appleBasket.removeFromBasket();
        });
    }

    @Test
    public void expectBasketEmptyException() {
        assertThrows(BasketEmptyException.class, () -> {
            Mushroom mushroom = new Mushroom();
            Basket<Mushroom> mushroomBasket = new Basket<>();
            mushroomBasket.removeFromBasket();
            mushroomBasket.addToBasket(mushroom);
        });
    }

}
