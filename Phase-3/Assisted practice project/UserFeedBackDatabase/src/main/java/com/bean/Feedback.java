package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feedback {
	@Id
	private int id;
	private String fname;
	private String lname;
	private String feedback;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return "Feedback [id=" + id + ", fname=" + fname + ", lname=" + lname + ", feedback=" + feedback + "]";
	}
	public Feedback(int id, String fname, String lname, String feedback) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.feedback = feedback;
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
