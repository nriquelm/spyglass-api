package com.skillstorm.spyglassapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.spyglassapi.models.Goal;


/**
 * A repository that accesses data about goals. 
 */
@Repository
public interface GoalRepository extends JpaRepository<Goal, Integer> {

}
