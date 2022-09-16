package com.example.bike.customer.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.bike.inventory.entity.inventoryEntity;

@Entity
@Table(name="Customer")
public class customerEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Customer_id")
	 private int customerId;
	
	@Column(name="Aadhar_Number")
	 private long aadharNumber;
	
	@Column(name="Phone_Number")
	 private long phoneNumber;
	
	@Column(name="Licence_Number")
	private String licenceNumber;
	
	@Column(name="Bike_Name")
	private String bikeName;
	
	@Column(name="Bike_No")
	private String bikeNumber;
	
	@Column(name="Fine")
	private float fine;
	
	@Column(name="total_Amount")
	private float totalAmount;
	
	@Column(name="Permanent_Address")
	private String permanentAddress;
	
	@Column(name="Secondary_Address")
	private String secondaryAddress;
	
	@Column(name="City")
	private String city;
	
	@Column(name="State")
	private String state;
	
	@Column(name="Pincode")
	private int  pincode;

	@Column(name="Pan_Number")
	private String panNumber;
	
	@Column(name="Email")
	 private String email;
	
	@Column(name="FirstName")
	 private String firstName;
	
	@Column(name="LastName")
	 private String lastName;
	
	@Column(name="Age")
	private int age;
	
	
	
	@Column(name="Check_In")
	private LocalDate checkIn ;
	
	@Column(name="Check_Out")
	private LocalDate checkOut;
	 
	@Column(name="Inventory_Id")
	private int InventoryId;
	
	@OneToOne
	@JoinColumn(name = "Inventory_Id", nullable = true, insertable = false, updatable = false)
	private inventoryEntity inventoryEntity;

	public customerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public customerEntity(int customerId, long aadharNumber, long phoneNumber, String licenceNumber, String bikeName,
			 float fine, float totalAmount, String permanentAddress, String secondaryAddress,
			String city, String state, int pincode, String panNumber, String email, String firstName, String lastName,
			int age, String bikeNumber, LocalDate checkIn, LocalDate checkOut, int inventoryId,
			com.example.bike.inventory.entity.inventoryEntity inventoryEntity) {
		super();
		this.customerId = customerId;
		this.aadharNumber = aadharNumber;
		this.phoneNumber = phoneNumber;
		this.licenceNumber = licenceNumber;
		this.bikeName = bikeName;
		this.fine = fine;
		this.totalAmount = totalAmount;
		this.permanentAddress = permanentAddress;
		this.secondaryAddress = secondaryAddress;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.panNumber = panNumber;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.bikeNumber = bikeNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		InventoryId = inventoryId;
		this.inventoryEntity = inventoryEntity;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLicenceNumber() {
		return licenceNumber;
	}

	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}



	public float getFine() {
		return fine;
	}

	public void setFine(float fine) {
		this.fine = fine;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBikeNumber() {
		return bikeNumber;
	}

	public void setBikeNumber(String bikeNumber) {
		this.bikeNumber = bikeNumber;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(LocalDate checkIn) {
		this.checkIn = checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(LocalDate checkOut) {
		this.checkOut = checkOut;
	}

	public int getInventoryId() {
		return InventoryId;
	}

	public void setInventoryId(int inventoryId) {
		InventoryId = inventoryId;
	}

	public inventoryEntity getInventoryEntity() {
		return inventoryEntity;
	}

	public void setInventoryEntity(inventoryEntity inventoryEntity) {
		this.inventoryEntity = inventoryEntity;
	}

	
}
