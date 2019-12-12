package com.demo.workout.resource.api;

import com.demo.workout.model.WorkoutType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class WorkoutPO {
    private WorkoutType workoutPOType;
    private String title;

    public String getTitle() {
        return this.title;
    }
    public WorkoutType getWorkoutPOType() {
        return this.workoutPOType;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setWorkoutPOType(WorkoutType workoutType) {
        this.workoutPOType = workoutType;
    }
}
