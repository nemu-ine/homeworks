package io.codelex.tests.firstTest.exercise5;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static DecimalFormat df = new DecimalFormat("#.##");

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Peter", "Angelina", "Bravo");
        double percent = partOf(names, (String name) -> name.length() > 4);
        System.out.println(df.format(percent) + "%");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        double evenPercent = partOf(numbers, (Integer n) -> n % 2 == 1);
        System.out.println(df.format(evenPercent) + "%");
    }

    public static <T> double partOf(List<T> list, Predicate<T> condition) {
        long count = list.stream()
                .filter(condition)
                .count();
        return (double) count / list.size() * 100;
    }

}
