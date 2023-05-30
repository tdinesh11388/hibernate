package com.app.HutsunMilk.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FarmerInfo  implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String milkQuantity;
	
	private String numberOfCows;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMilkQuantity() {
		return milkQuantity;
	}

	public void setMilkQuantity(String milkQuantity) {
		this.milkQuantity = milkQuantity;
	}

	public String getNumberOfCows() {
		return numberOfCows;
	}

	public void setNumberOfCows(String numberOfCows) {
		this.numberOfCows = numberOfCows;
	}
	
}
