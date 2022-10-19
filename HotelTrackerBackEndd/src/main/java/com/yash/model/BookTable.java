package com.yash.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookTable {

	private String name;
	@Id
	private String mobilenumber;
	private String date;
	private String gender;
	private String people;
	private String section;
	private String  email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPeople() {
		return people;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "BookTable [name=" + name + ", mobilenumber=" + mobilenumber + ", date=" + date + ", gender=" + gender
				+ ", people=" + people + ", section=" + section + ", email=" + email + "]";
	}
	public BookTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
