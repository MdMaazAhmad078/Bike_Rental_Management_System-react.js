package com.example.bike.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bike.customer.bean.customerBean;
import com.example.bike.customer.service.customerService;
import com.example.bike.inventory.bean.inventoryBean;
import com.example.bike.inventory.entity.inventoryEntity;
import com.example.bike.inventory.service.inventoryService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Controller")
public class inventoryController {

	@Autowired
	inventoryService inventoryService;
	
	
	
	@PostMapping(value="/CreateInventory")
	public void createInventory(@RequestBody inventoryBean inventoryBean)
	{
		inventoryService.createInventory(inventoryBean);
	}
	
	@DeleteMapping(value="/DeleteInventory/{id}")
	public void deleteInventorytbyId(@PathVariable("id") int id) {
		inventoryService.deleteInventoryById(id);
	}
	
	@PostMapping(value="GetInventoryByID/{id}")
	public inventoryBean getInventorybyId(@PathVariable("id") int id)
	{
		return inventoryService.getInventoryById(id);
	}
	
	@GetMapping(value="GetListOfInventory")
	public List<inventoryBean> getListOfInventoryList()
	{
		return inventoryService.getListOfInventoryList();
	
}
	
	@GetMapping(value="getListofAvailableInventorys")
	public List<inventoryBean> getListofAvailableInventorys() {
		return inventoryService.getListofAvailableInventorys();
	}
	
	@PostMapping(value="GetBikeNumbersByBikeName/{name}")
	public List<inventoryEntity> getBikeNumbersByBikeName(@PathVariable("name") String name)
	{
		return inventoryService.getBikeNumbersByBikeName(name);
	}
	
	
	
	
}