package io.codelex.polymorphism.practice.exercise1;


public interface Car {

    void speedUp();
    void slowDown();

    default void startEngine() {
        System.out.println("Rrrrrrrrrrr...........");
    }

    default String getCurrentSpeed() {
        return getClass().getSimpleName() + " current speed is " + getSpeed();
    }

    default Integer getSpeed() {
        return 0;
    }

}
