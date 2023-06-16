package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Zebra extends Mammal {

    public Zebra(String name, String type, double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("*some zebra sound*");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            foodEaten += food.getQuantity();
        } else {
            System.out.println("Zebras are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return getClass().getSimpleName() + "["
                + animalName + ", "
                + df.format(animalWeight) + ", "
                + livingRegion + ", "
                + foodEaten
                + "]";
    }
}
