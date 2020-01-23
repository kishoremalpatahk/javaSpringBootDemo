package com.kishu.beans;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int userId;
	//@Pattern(regexp = "[A-Za-z]+[A-Za-z0-9_.]+@[a-z]{2,}.[a-z] {2,3}",message = "Please Enter valid email.")
	private String userEmail;
	private String pass;
	
	public User() {
		super();
	}

	public User(int userId, String userEmail, String pass) {
		super();
		this.userId = userId;
		this.userEmail = userEmail;
		this.pass = pass;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userEmail=" + userEmail + ", pass=" + pass + "]";
	}
	
	
}
