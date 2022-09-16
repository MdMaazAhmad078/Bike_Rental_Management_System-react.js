package com.example.bike.inventory.bean;

public class inventoryBean {
	private int inventoryId;
	private String bikeNumber;
	private String bikeName;
	private float price ;
	private String status;
	private String bikeType;
	private String bikeModel;
	private int cc;
	private String brand;
	
	public inventoryBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public inventoryBean(int inventoryId, String bikeNumber, String bikeName, float price, String status,
			String bikeType, String bikeModel, int cc, String brand) {
		super();
		this.inventoryId = inventoryId;
		this.bikeNumber = bikeNumber;
		this.bikeName = bikeName;
		this.price = price;
		this.status = status;
		this.bikeType = bikeType;
		this.bikeModel = bikeModel;
		this.cc = cc;
		this.brand = brand;
	}

	public int getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBikeType() {
		return bikeType;
	}

	public void setBikeType(String bikeType) {
		this.bikeType = bikeType;
	}

	public String getBikeModel() {
		return bikeModel;
	}

	public void setBikeModel(String bikeModel) {
		this.bikeModel = bikeModel;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	
}
