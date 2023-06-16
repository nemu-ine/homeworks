package io.codelex.polymorphism.practice.exercise1;

public class Lexus implements Car, NitrousOxideEngine {
    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 8;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 8;
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
    }

    @Override
    public Integer getSpeed() {
        return currentSpeed;
    }

}
