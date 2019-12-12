package com.demo.workout.model;

public class Workout {
    private WorkoutType workoutType;
    private String title;
    public String getTitle() {
        return this.title;
    }
    public WorkoutType getWorkoutType() {
        return this.workoutType;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setWorkoutType(WorkoutType workoutType) {
        this.workoutType = workoutType;
    }
}
