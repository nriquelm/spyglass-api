package com.skillstorm.spyglassapi.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.skillstorm.spyglassapi.models.Goal;
import com.skillstorm.spyglassapi.repositories.GoalRepository;


/**
 * Service used by the GoalController to process information about a goal in the application.
 */
@CrossOrigin(origins="*")
@Service
public class GoalService {
	
	@Autowired
	private GoalRepository goalRepo;
	
	public List<Goal >getGoals() {
		return goalRepo.findAll();
	}
	
	public void addGoal(Goal goal) {
		goalRepo.save(goal);
	}
	
	public void updateGoal(Goal goal) {
		goalRepo.save(goal);
	}
	
	public void deleteGoal(Integer id) {
		goalRepo.deleteById(id);
	}

}
