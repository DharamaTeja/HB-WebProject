package com.hibernate;

import java.util.Date;

public class Userinfo {

	private int id;
	private String name;
	private String email;
	private long mobileno;
	private Date dob;

	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "Userinfo [id=" + id + ", name=" + name + ", email=" + email + ", mobileno=" + mobileno + ", dob=" + dob
				+ "]";
	}
	
	
	}
	
	
	


