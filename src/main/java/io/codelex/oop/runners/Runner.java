package io.codelex.oop.runners;

enum Runner {

    BEGINNER(0, 100),
    INTERMEDIATE(101, 200),
    ADVANCED(201, Integer.MAX_VALUE);

    private final int min;
    private final int max;

    Runner(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public static Runner getFitnessLevel(int t) {
        for (Runner x : Runner.values()) {
            if (t >= x.min && t <= x.max) {
                return x;
            }
        }
        return null;
    }

}
