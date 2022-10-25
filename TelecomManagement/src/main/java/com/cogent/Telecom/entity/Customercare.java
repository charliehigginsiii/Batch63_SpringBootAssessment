package com.cogent.Telecom.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customercare {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String complaint;
	private String description;
	private long userId;
	private String statusOfComplain;
	
	public Customercare() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customercare(long id, String complaint, String description, long userId, String statusOfComplain) {
		super();
		this.id = id;
		this.complaint = complaint;
		this.description = description;
		this.userId = userId;
		this.statusOfComplain = statusOfComplain;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getComplaint() {
		return complaint;
	}
	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getStatusOfComplain() {
		return statusOfComplain;
	}
	public void setStatusOfComplain(String statusOfComplain) {
		this.statusOfComplain = statusOfComplain;
	}
	
}
