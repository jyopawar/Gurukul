package com.education.Gurukul.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private Long id;
	private String fullName;
	private int contactNumber;
	private String emailId;
	private String courseName;
	private int courseFees;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(int courseFees) {
		this.courseFees = courseFees;
	}
	public Student() {
		
	}
	public Student(String fullName, int contactNumber, String emailId, String courseName, int courseFees) {
		super();
		//this.id=id;
		this.fullName = fullName;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
		this.courseName = courseName;
		this.courseFees = courseFees;
	}
	
	
}
