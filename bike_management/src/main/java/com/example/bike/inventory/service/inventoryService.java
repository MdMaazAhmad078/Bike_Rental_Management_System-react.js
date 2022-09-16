package com.example.bike.inventory.service;

import java.util.List;

import com.example.bike.inventory.bean.inventoryBean;
import com.example.bike.inventory.entity.inventoryEntity;

public interface inventoryService {
	public inventoryBean createInventory(inventoryBean inventoryBean);
	public inventoryBean getInventoryById(int id);
	public List<inventoryBean> getListOfInventoryList();
	public void deleteInventoryById(int id);
	public List<inventoryBean> getListofAvailableInventorys();
	public List<inventoryEntity> getBikeNumbersByBikeName(String name);
	

}
