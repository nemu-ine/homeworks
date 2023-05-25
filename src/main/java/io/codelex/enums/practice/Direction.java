package io.codelex.enums.practice;

public enum Direction {
    NORTH, SOUTH, EAST, WEST;

    static public String getString(Direction x) {
        switch (x) {
            case NORTH -> {
                return "up";
            }
            case SOUTH -> {
                return "down";
            }
            case EAST -> {
                return "right";
            }
            case WEST -> {
                return "left";
            }
        }
        return "";
    }

}
