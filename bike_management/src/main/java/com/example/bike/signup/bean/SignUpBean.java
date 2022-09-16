package com.example.bike.signup.bean;

public class SignUpBean {
	private int signupId;
	private String name;
	private String email;
	private String username;
	private long phoneNumber;
	private String password;
	
	
	public SignUpBean() {
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
