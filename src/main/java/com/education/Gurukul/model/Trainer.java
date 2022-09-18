package com.education.Gurukul.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainer {
	@Id
    private long id;
	private String trainerName;
	private String qualification;
	private int yearofexperience;
	private Date dateofbirth;
	private String skillSet;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getYearofexperience() {
		return yearofexperience;
	}
	public void setYearofexperience(int yearofexperience) {
		this.yearofexperience = yearofexperience;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	public Trainer() {
	}
	public Trainer(int id, String trainerName, String qualification, int yearofexperience, Date dateofbirth,
			String skillSet) {
		super();
		this.id = id;
		this.trainerName = trainerName;
		this.qualification = qualification;
		this.yearofexperience = yearofexperience;
		this.dateofbirth = dateofbirth;
		this.skillSet = skillSet;
	}
	
}
