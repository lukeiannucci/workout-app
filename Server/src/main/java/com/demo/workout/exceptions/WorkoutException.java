package com.demo.workout.exceptions;

public class WorkoutException extends RuntimeException {
    public WorkoutException(String errorMessage) {
        super(errorMessage);
    }
}
