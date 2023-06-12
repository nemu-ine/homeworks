package io.codelex.oop.summary.generics;

import java.util.function.Supplier;

public class LazyBox<T> {

    private Supplier<T> func;
    private T object;

    public LazyBox(Supplier<T> func){
        this.func = func;
        this.object = null;
    }

    public T get() {
        if (object == null) {
            object = func.get();
        }
        return object;
    }

}
