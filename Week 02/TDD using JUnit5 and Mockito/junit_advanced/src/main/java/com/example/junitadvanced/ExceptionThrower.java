package com.example.junitadvanced;

public class ExceptionThrower {
    public void throwException(boolean shouldThrow) {
        if (shouldThrow) {
            throw new IllegalArgumentException("Invalid input");
        }
    }
}

