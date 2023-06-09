package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static List<Animal> animalList = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Take note: Code only adds an animal to a list only after valid food entry");

        while (true) {
            System.out.println("{AnimalType} {AnimalName} {AnimalWeight} {AnimalLivingRegion} {CatBreed}<-(Only if its cat) [\"end\" to quit]");
            String in = input.nextLine();
            if (in.toLowerCase().equals("end")) {
                input.close();
                break;
            }
            String[] newAnimal = in.split(" ");
            if (newAnimal.length < 4 || newAnimal[0].equals("Cat") && newAnimal.length < 5) continue;

            Animal animal;
            Food food;

            switch(newAnimal[0]) {
                case "Mouse" -> animal = new Mouse(newAnimal[1], newAnimal[0], Double.parseDouble(newAnimal[2]), newAnimal[3]);
                case "Zebra" -> animal = new Zebra(newAnimal[1], newAnimal[0], Double.parseDouble(newAnimal[2]), newAnimal[3]);
                case "Tiger" -> animal = new Tiger(newAnimal[1], newAnimal[0], Double.parseDouble(newAnimal[2]), newAnimal[3]);
                case "Cat" -> animal = new Cat(newAnimal[1], newAnimal[0], Double.parseDouble(newAnimal[2]), newAnimal[3], newAnimal[4]);
                default -> {
                    System.out.println("No allowed animal type entered");
                    continue;
                }
            }
            System.out.print("> ");
            animal.makeSound();


            System.out.println("{FoodType} {FoodQuantity}");
            String[] newFood = input.nextLine().split(" ");
            if (newFood.length < 2 || Double.parseDouble(newFood[1]) % 1 != 0) continue;

            switch(newFood[0]) {
                case "Meat" -> food = new Meat(Integer.parseInt(newFood[1]));
                case "Vegetable" -> food = new Vegetable(Integer.parseInt(newFood[1]));
                default -> {
                    System.out.println("No allowed food type entered");
                    continue;
                }
            }

            System.out.print("> ");
            animal.eat(food);
            if (animal.getFoodEaten() > 0) {
                System.out.println(animal);
            }
            animalList.add(animal);
        }

        System.out.println("> " + animalList.stream().map(Animal::toString).collect(Collectors.joining(", ")));
    }

}
