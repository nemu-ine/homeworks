package io.codelex.polymorphism.practice.exercise6;

public abstract class Animal {

    String animalName, animalType;
    double animalWeight;
    Integer foodEaten;

    public Animal(String name, String type, double weight) {
        this.animalName = name;
        this.animalType = type;
        this.animalWeight = weight;
        this.foodEaten = 0;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    abstract void makeSound();
    abstract void eat(Food food);

}
