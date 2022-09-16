package com.example.bike.employee.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Staff")
public class employeeEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="EMPLOYEE_id")
	private int employeeId;
	
	@Column(name="Staff_id")
	private int staffId;
	
	
	@Column(name="D_O_B")
	private LocalDate dateOfBirth;
	
	@Column(name="D_O_JOIN")
	private LocalDate dateOfJoin;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="FATHER_NAME")
	private String fatherName;
	
	@Column(name="MOTHER_NAME")
	private String motherName;
	
	@Column(name="GENDER")
	private String gender;
	
	@Column(name="AADHAR_NUMBER")
	private long addharNumber;
	
	@Column(name="PAN_NUMBER")
	private String panNumber;
	
	@Column(name="E_MAIL")
	private String email;
	
	@Column(name="PHONE_NUMBER")
	private long phoneNumber;
	
	@Column(name="PERMANENT_ADDRESS")
	private String permanentAddress;
	
	@Column(name="SECONDARY_ADDRESS")
	private String secondaryAddress;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="PINCODE")
	private int pinCode;
	
	@Column(name="AGE")
	private int age;

	@Column(name="SALARY")
	private int salary;
	
	@Column(name="ROLE")
	private String role;
	
	public employeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public employeeEntity(int employeeId, int staffId, LocalDate dateOfBirth, LocalDate dateOfJoin, String firstName,
			String lastName, String fatherName, String motherName, String gender, long addharNumber, String panNumber,
			String email, long phoneNumber, String permanentAddress, String secondaryAddress, String city, String state,
			int pinCode, int age, int salary, String role) {
		super();
		this.employeeId = employeeId;
		this.staffId = staffId;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoin = dateOfJoin;
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
