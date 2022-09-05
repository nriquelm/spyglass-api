package com.skillstorm.spyglassapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.spyglassapi.models.Goal;

@Repository
public interface GoalRepository extends JpaRepository<Goal, Integer> {

}
