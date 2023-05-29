package io.codelex.oop.cars;

public enum EngineType {
    V12,
    V8,
    V6,
    S6,
    S4,
    S3,
    MISSING_TYPE;

    public static EngineType stringToVal (String input) {
        EngineType out = MISSING_TYPE;
        switch (input) {
            case "V12" -> out = EngineType.V12;
            case "V8" -> out = EngineType.V8;
            case "V6" -> out = EngineType.V6;
            case "S6" -> out = EngineType.S6;
            case "S4" -> out = EngineType.S4;
            case "S3" -> out = EngineType.S3;
        }
        return out;
    }

}
