package com.example.bike.signup.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sign_Up")
public class SignUpEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Signup_id")
	private int signupId;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Username")
	private String username;
	
	@Column(name="Phone_Number")
	private long phoneNumber;
	
	@Column(name="Password")
	private String password;

	public SignUpEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public int getSignupId() {
		return signupId;
	}

	public void setSignupId(int signupId) {
		this.signupId = signupId;
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

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
