package com.fdmgroup.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Trainer {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Trainer_SEQ")
	@SequenceGenerator(name = "Trainer_SEQ", sequenceName = "SEQUENCE_TRAINER", allocationSize = 3)
	@Column(nullable = false, updatable = false, length = 5, unique = true)
	private int tId;
	private String tName;
	private String phoneNum;

	@ManyToMany
	private List<Course> courses = new ArrayList<Course>();

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Trainer(int tId, String tName, String phoneNum) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.phoneNum = phoneNum;
	}

	public Trainer(String tName, String phoneNum) {
		super();
		this.tName = tName;
		this.phoneNum = phoneNum;
	}

	public Trainer() {
		super();
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

}
