package com.demo.workout.service;

import com.demo.workout.exceptions.WorkoutException;
import com.demo.workout.mapper.WorkoutMapper;
import com.demo.workout.model.Workout;
import com.demo.workout.repository.WorkoutRepository;
import com.demo.workout.repository.api.WorkoutDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WorkoutService {
    private final WorkoutRepository workoutRepository;

    @Autowired
    public WorkoutService(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    public Workout getWorkoutType(Long id) {
        WorkoutDO workoutDo = workoutRepository.findById(id).orElseThrow(() -> new WorkoutException("Workout not found"));
        return WorkoutMapper.WorkoutDOToWorkout(workoutDo);
    }

    public Workout createWorkout(Workout workout) {
        WorkoutDO workoutDO = WorkoutMapper.WorkoutToWorkoutDO(workout);
        return WorkoutMapper.WorkoutDOToWorkout(workoutRepository.save(workoutDO));
    }

    public List<Workout> getAllWorkouts() {
        return ((List<WorkoutDO>)workoutRepository.findAll()).stream().map(WorkoutMapper::WorkoutDOToWorkout).collect(Collectors.toList());
    }
}
