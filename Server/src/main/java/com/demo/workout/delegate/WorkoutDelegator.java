package com.demo.workout.delegate;

import com.demo.workout.mapper.WorkoutMapper;
import com.demo.workout.model.Workout;
import com.demo.workout.resource.api.WorkoutPO;
import com.demo.workout.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.Collectors;

@Component
public class WorkoutDelegator {
    private final WorkoutService workoutService;

    @Autowired
    public WorkoutDelegator(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    public WorkoutPO getWorkoutType(Long id) {
        return WorkoutMapper.WorkoutToWorkoutPO(workoutService.getWorkoutType(id));
    }

    public WorkoutPO createWorkout(WorkoutPO workoutPO) {
        Workout workout = WorkoutMapper.WorkoutPOToWorkout(workoutPO);
        return WorkoutMapper.WorkoutToWorkoutPO(workoutService.createWorkout(workout));
    }

    public Collection<WorkoutPO> getAllWorkouts() {
        return workoutService.getAllWorkouts().stream().map(WorkoutMapper::WorkoutToWorkoutPO).collect(Collectors.toList());
    }
}
