package com.demo.workout.resource;

import com.demo.workout.delegate.WorkoutDelegator;
import com.demo.workout.model.Workout;
import com.demo.workout.resource.api.WorkoutPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("workout")
public class WorkoutController {
    private final WorkoutDelegator workoutDelegator;

    @Autowired
    public WorkoutController(WorkoutDelegator workoutDelegator) {
        this.workoutDelegator = workoutDelegator;
    }

    @PostMapping
    public ResponseEntity<WorkoutPO> addWorkout(@RequestBody WorkoutPO workoutPO) {
        return ResponseEntity.status(HttpStatus.OK).body(workoutDelegator.createWorkout(workoutPO));
    }

    @GetMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Collection<WorkoutPO>> getAllWorkouts() {
        return ResponseEntity.status(HttpStatus.OK).body(workoutDelegator.getAllWorkouts());
    }

    @GetMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<WorkoutPO> getWorkoutType(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(workoutDelegator.getWorkoutType(id));
    }
}
