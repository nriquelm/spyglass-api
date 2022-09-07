package com.skillstorm.spyglassapi.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

@Entity
@Table(name="goal")
@Validated
public class Goal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="goal_id")
	private int goalId;
	
	@NotNull
	@Column(name="goal_name")
	private String name;
	
	@NotNull
	@Column(name="goal_description")
	private String description;
	
	@NotNull
	@Column(name="image_path")
	private String imagePath;
	
	@NotNull
	@Column(name="target_date")
	private LocalDate targetDate;
	
	@NotNull
	@Column(name="target_amount")
	private double targetAmount;
	
	@NotNull
	@Column(name="current_amount")
	private double currentAmount;
	
	public Goal() {
		
	}
	
	public Goal(int goalId, String name, String description, String imagePath, LocalDate targetDate, float targetAmount, float currentAmount) {
		this.goalId = goalId;
		this.name = name;
		this.description = description;
		this.imagePath = imagePath;
		this.targetDate = targetDate;
		this.targetAmount = targetAmount;
		this.currentAmount = currentAmount;
	}

	public int getGoalId() {
		return goalId;
	}

	public void setGoalId(int goalId) {
		this.goalId = goalId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public double getTargetAmount() {
		return targetAmount;
	}

	public void setTargetAmount(float targetAmount) {
		this.targetAmount = targetAmount;
	}

	public double getCurrentAmount() {
		return currentAmount;
	}

	public void setCurrentAmount(float currentAmount) {
		this.currentAmount = currentAmount;
	}
	
	
	
}
