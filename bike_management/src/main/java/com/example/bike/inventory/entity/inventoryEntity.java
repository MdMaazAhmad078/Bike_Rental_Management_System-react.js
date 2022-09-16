package com.example.bike.inventory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Inventory")
public class inventoryEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Inventory_Id")
	private int  inventoryId;
	
	@Column(name="Bike_Number")
	private String bikeNumber;
	
	@Column(name="Bike_Name")
	private String bikeName;
	
	@Column(name="Bike_Type")
	private String bikeType;
	
	@Column(name="Bike_Model")
	private String bikeModel;
	
	@Column(name="Cubic_Capacity")
	private int cc;
	
	@Column(name="Brand")
	private String brand;
	
	@Column(name="Price")
	private float price ;
	
	@Column(name="Status")
	private String status;

	public inventoryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public inventoryEntity(int inventoryId, String bikeNumber, String bikeName, String bikeType, String bikeModel,
			int cc, String brand, float price, String status) {
		super();
		this.inventoryId = inventoryId;
		this.bikeNumber = bikeNumber;
		this.bikeName = bikeName;
		this.bikeType = bikeType;
		this.bikeModel = bikeModel;
		this.cc = cc;
		this.brand = brand;
		this.price = price;
		this.status = status;
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

	

}
