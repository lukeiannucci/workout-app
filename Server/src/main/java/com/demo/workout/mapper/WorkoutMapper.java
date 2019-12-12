package com.demo.workout.mapper;

import com.demo.workout.model.Workout;
import com.demo.workout.repository.api.WorkoutDO;
import com.demo.workout.resource.api.WorkoutPO;

public class WorkoutMapper {
    public static Workout WorkoutDOToWorkout(WorkoutDO workoutDo) {
        Workout workout = new Workout();
        workout.setWorkoutType(workoutDo.getWorkoutDOType());
        workout.setTitle(workoutDo.getTitle());
        return workout;
    }

    public static WorkoutDO WorkoutToWorkoutDO(Workout workout) {
        WorkoutDO workoutDO = new WorkoutDO();
        workoutDO.setWorkoutDOType(workout.getWorkoutType());
        workoutDO.setTitle(workout.getTitle());
        return workoutDO;
    }

    public static Workout WorkoutPOToWorkout(WorkoutPO workoutPo) {
        Workout workout = new Workout();
        workout.setWorkoutType(workoutPo.getWorkoutPOType());
        workout.setTitle(workoutPo.getTitle());
        return workout;
    }

    public static WorkoutPO WorkoutToWorkoutPO(Workout workout) {
        WorkoutPO workoutPO = new WorkoutPO();
        workoutPO.setWorkoutPOType(workout.getWorkoutType());
        workoutPO.setTitle(workout.getTitle());
        return workoutPO;
    }
}
