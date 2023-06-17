package io.codelex.tests.firstTest.exercise3;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Joiner<T> {

    private final String separator;

    public Joiner(String separator) {
        this.separator = Objects.requireNonNullElse(separator, "");
    }

    @SafeVarargs
    public final String join(T... items) {
        return Arrays.stream(items)
                .map(Object::toString)
                .collect(Collectors.joining(separator));
    }

}
