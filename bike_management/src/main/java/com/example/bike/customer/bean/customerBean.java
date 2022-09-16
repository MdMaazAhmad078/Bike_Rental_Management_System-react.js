package com.example.bike.customer.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.example.bike.inventory.entity.inventoryEntity;

public class customerBean {
	
	 private long aadharNumber;
	 private long phoneNumber;
		private String licenceNumber;
		private String panNumber;
	 private String firstName;
	 private String lastName;
	private int age;
	private String bikeNumber;
	private String bikeName;
	private float fine;
	private float totalAmount;
	private LocalDate bookingDate;
	private LocalDate deliveryDate;
	private String email;
	private String permanentAddress;
	private String secondaryAddress;
	private String city;
	private String state;
	private int  pincode;
	 private int customerId;
	 private int inventoryId;
	 private inventoryEntity inventoryEntity;
	 
	public customerBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public customerBean(long aadharNumber, long phoneNumber, String licenceNumber, String panNumber, String firstName,
			String lastName, int age, String bikeNumber, String bikeName, float fine, float totalAmount,
			LocalDate bookingDate, LocalDate deliveryDate, String email, String permanentAddress,
			String secondaryAddress, String city, String state, int pincode, int customerId, int inventoryId,
			com.example.bike.inventory.entity.inventoryEntity inventoryEntity) {
		super();
		this.aadharNumber = aadharNumber;
		this.phoneNumber = phoneNumber;
		this.licenceNumber = licenceNumber;
		this.panNumber = panNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.bikeNumber = bikeNumber;
		this.bikeName = bikeName;
		this.fine = fine;
		this.totalAmount = totalAmount;
		this.bookingDate = bookingDate;
		this.deliveryDate = deliveryDate;
		this.email = email;
		this.permanentAddress = permanentAddress;
		this.secondaryAddress = secondaryAddress;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.customerId = customerId;
		this.inventoryId = inventoryId;
		this.inventoryEntity = inventoryEntity;
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

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
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

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	public inventoryEntity getInventoryEntity() {
		return inventoryEntity;
	}

	public void setInventoryEntity(inventoryEntity inventoryEntity) {
		this.inventoryEntity = inventoryEntity;
	}

	
}