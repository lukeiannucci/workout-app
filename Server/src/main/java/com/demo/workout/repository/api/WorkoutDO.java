package com.demo.workout.repository.api;

import com.demo.workout.model.WorkoutType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WorkoutDO {
    private WorkoutType workoutDOType;
    private String title;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    public String getTitle() {
        return this.title;
    }
    public WorkoutType getWorkoutDOType() {
        return this.workoutDOType;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setWorkoutDOType(WorkoutType workoutType) {
        this.workoutDOType = workoutType;
    }
}
