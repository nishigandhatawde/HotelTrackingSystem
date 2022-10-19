package com.yash.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String emailId;

	private String password;
	private String firstname;
	private String lastname;
	private String phonenumber;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String emailId, String password, String firstname, String lastname, String phonenumber) {
		super();
		this.id = id;
		this.emailId = emailId;

		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phonenumber = phonenumber;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

}