package io.codelex.tests.firstTest.exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Joiner<T> {

    private final List<T> list;
    private final String separator;


    public Joiner(String separator) {
        list = new ArrayList<>();
        this.separator = Objects.requireNonNullElse(separator, "");
    }

    @SafeVarargs
    public final void join(T... items) {
        list.addAll(Arrays.asList(items));
    }

    @Override
    public String toString() {
        return list.stream()
                .map(Object::toString)
                .collect(Collectors.joining(separator));
    }

}
