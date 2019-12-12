package com.demo.workout.repository;

import com.demo.workout.repository.api.WorkoutDO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface WorkoutRepository extends CrudRepository<WorkoutDO, Long> {

}
