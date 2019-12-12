package com.demo.workout.model;

public enum WorkoutType {
    RUNNING("RUNNING"),
    BIKING("BIKING"),
    SWIMMING("SWIMMING"),
    WEIGHT_TRAINING("WEIGHT_TRAINING"),
    SPORT("SPORT"),
    UNKNOWN("UNKNOWN");
    private String resourceValue;
    private String databaseValue;
    WorkoutType(String value) {
        this.resourceValue = value;
        this.databaseValue = value;
    }

    WorkoutType(String resourceValue, String databaseValue) {
        this.resourceValue = resourceValue;
        this.databaseValue = databaseValue;
    }
}


