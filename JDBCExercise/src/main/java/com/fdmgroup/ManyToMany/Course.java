package com.fdmgroup.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {

	@Id
	private int cId;
	private String cName;
	private double cFees;

	@ManyToMany(mappedBy = "courses")
	private List<Trainer> trainers = new ArrayList<Trainer>();

	public List<Trainer> getTrainers() {
		return trainers;
	}

	public void setTrainers(List<Trainer> trainers) {
		this.trainers = trainers;
	}

	public Course(int cId, String cName, double cFees) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cFees = cFees;
	}

	public Course() {
		super();
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public double getcFees() {
		return cFees;
	}

	public void setcFees(double cFees) {
		this.cFees = cFees;
	}

	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + ", cFees=" + cFees + "]";
	}

}
