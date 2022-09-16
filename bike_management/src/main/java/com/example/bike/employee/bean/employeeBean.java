package com.example.bike.employee.bean;

import java.time.LocalDate;

public class employeeBean {
	
	private LocalDate dateOfBirth;
	private LocalDate dateOfJoin;
	private int employeeId;
	private int staffId;
	private String firstName;
	private String lastName;
	private String fatherName;
	private String motherName;
	private String gender;
	private long addharNumber;
	private String panNumber;
	private String email;
	private long phoneNumber;
	private String permanentAddress;
	private String secondaryAddress;
	private String city;
	private String state;
	private int pinCode;
	private int age;
	private int salary;
	private String role;
	public employeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employeeBean(LocalDate dateOfBirth, LocalDate dateOfJoin, int employeeId, int staffId, String firstName,
			String lastName, String fatherName, String motherName, String gender, long addharNumber, String panNumber,
			String email, long phoneNumber, String permanentAddress, String secondaryAddress, String city, String state,
			int pinCode, int age, int salary, String role) {
		super();
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoin = dateOfJoin;
		this.employeeId = employeeId;
		this.staffId = staffId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.gender = gender;
		this.addharNumber = addharNumber;
		this.panNumber = panNumber;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.permanentAddress = permanentAddress;
		this.secondaryAddress = secondaryAddress;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.age = age;
		this.salary = salary;
		this.role = role;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public LocalDate getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(LocalDate dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getAddharNumber() {
		return addharNumber;
	}
	public void setAddharNumber(long addharNumber) {
		this.addharNumber = addharNumber;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
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
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getSecondaryAddress() {
		return secondaryAddress;
	}
	public void setSecondaryAddress(String secondaryAddress) {
		this.secondaryAddress = secondaryAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
