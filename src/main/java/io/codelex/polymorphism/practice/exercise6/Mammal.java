package io.codelex.polymorphism.practice.exercise6;

public abstract class Mammal extends Animal {

    protected String livingRegion;

    public Mammal(String name, String type, double weight, String livingRegion) {
        super(name, type, weight);
        this.livingRegion = livingRegion;
    }

}
