package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {

        Car audi = new Audi(), bmw = new Bmw(), lexus = new Lexus(), tesla = new Tesla(), ford = new Ford(), hyundai = new Hyundai();
        List<Car> cars = new ArrayList<>(List.of(audi, bmw, lexus, tesla, ford, hyundai));

        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                cars.stream()
                        .filter(car -> car instanceof NitrousOxideEngine)
                        .forEach(car -> ((NitrousOxideEngine) car).useNitrousOxideEngine());
                cars.stream()
                        .filter(car -> !(car instanceof NitrousOxideEngine))
                        .forEach(Car::speedUp);
            } else {
                cars.forEach(Car::speedUp);
            }
        }

        System.out.println("The fastest Car is " +
                cars.stream()
                .max(Comparator.comparingInt(Car::getSpeed))
                .map(car -> car.getClass().getSimpleName() + " with the speed of " + car.getSpeed())
                .orElse("none, as there are no cars lol"));

    }

}
