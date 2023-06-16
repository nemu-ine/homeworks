package io.codelex.polymorphism.practice.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person student = new Student("a", "b", "somewhere", 1, 4.0);
        Person employee = new Employee("b", "c", "also somewhere on the earth", 2, "Store manager");

        List<Person> people = new ArrayList<>(List.of(student, employee));
        people.forEach(Person::display);

    }

}
