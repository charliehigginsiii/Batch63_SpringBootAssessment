package com.cogent.Telecom.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Plans {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String plan;
	private String name;
	private float cost;
	private String valid;
	public Plans() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Plans(long id, String plan, String name, float cost, String valid) {
		super();
		this.id = id;
		this.plan = plan;
		this.name = name;
		this.cost = cost;
		this.valid = valid;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getValid() {
		return valid;
	}
	public void setValid(String valid) {
		this.valid = valid;
	}
	
}
