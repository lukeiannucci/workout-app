import { Component, OnInit } from '@angular/core';
import { WorkoutService } from 'src/app/shared/workout/workout.service';

@Component({
  selector: 'app-workout-list',
  templateUrl: './workout-list.component.html',
  styleUrls: ['./workout-list.component.css']
})
export class WorkoutListComponent implements OnInit {
  workouts: Array<any>
  constructor(private workoutService: WorkoutService) { }

  ngOnInit() {
    this.workoutService.getAll().subscribe(data => {
      this.workouts = data;
    });
  }

}
