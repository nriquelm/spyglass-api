package com.skillstorm.spyglassapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.spyglassapi.models.Goal;
import com.skillstorm.spyglassapi.services.GoalService;

@RestController
@CrossOrigin
public class GoalController {
	
	@Autowired
	private GoalService goalService;
	
	@GetMapping("/goals")
	public List<Goal> getGoals(){
		return goalService.getGoals();
	}
	
	@PostMapping("/goals/add")
	public void addGoal(@RequestBody Goal goal) {
		goalService.addGoal(goal);
	}
	
	@PutMapping("/goals/{id}/edit")
	public void updateGoal(@PathVariable("id") Integer id, @RequestBody Goal goal) {
		goalService.updateGoal(goal);
	}
	
	@DeleteMapping("/goals/{id}/delete")
	public void deleteGoal(@PathVariable("id") Integer id) {
		goalService.deleteGoal(id);
	}

}
