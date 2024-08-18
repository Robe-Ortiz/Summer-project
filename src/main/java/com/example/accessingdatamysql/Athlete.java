package com.example.accessingdatamysql;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

enum AthleteType {
	RUNNER, SWIMMER, CYCLIST
}

@Entity // This tells Hibernate to make a table out of this class
public class Athlete {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id;

	private String name;

	private int age;

	private double weight;

	private AthleteType athleteType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public AthleteType getAthleteType() {
		return athleteType;
	}

	public void setAthleteType(AthleteType athleteType) {
		this.athleteType = athleteType;
	}

}