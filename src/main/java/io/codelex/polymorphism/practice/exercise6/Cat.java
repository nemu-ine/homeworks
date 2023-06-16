package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Cat extends Feline {

    private String breed;

    public Cat(String name, String type, double weight, String livingRegion, String breed) {
        super(name, type, weight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void eat(Food food) {
        foodEaten += food.getQuantity();
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return getClass().getSimpleName() + "["
                + animalName + ", "
                + breed + ", "
                + df.format(animalWeight) + ", "
                + livingRegion + ", "
                + foodEaten
                + "]";
    }

}
