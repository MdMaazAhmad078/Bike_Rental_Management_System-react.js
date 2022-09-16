package com.example.bike.inventory.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bike.customer.entity.customerEntity;
import com.example.bike.customer.repository.customerRepository;
import com.example.bike.inventory.bean.inventoryBean;
import com.example.bike.inventory.entity.inventoryEntity;
import com.example.bike.inventory.repository.inventoryRepository;
import com.example.bike.inventory.service.inventoryService;

@Service
public class inventoryServiceImlp  implements inventoryService  {
	@Autowired
	private inventoryRepository inventoryRepository;
	
	@Autowired
	customerRepository customerrepository;
	
	@Override
	public inventoryBean createInventory(inventoryBean inventorybean)
	{
		inventoryEntity inventoryEntity= null;
		if(inventorybean!=null)
		{
			inventoryEntity = new inventoryEntity();
			BeanUtils.copyProperties(inventorybean, inventoryEntity);
			inventoryRepository.save(inventoryEntity);
		}
		if(inventoryEntity!=null)
		{
			inventorybean = new inventoryBean();
			BeanUtils.copyProperties(inventoryEntity, inventorybean);
			return inventorybean;
		}
		return null;
	}
	
	@Override
	public void deleteInventoryById(int id)
	{
		if(id!=0)
		{
			inventoryRepository.deleteById(id);
		}
	}
	
	@Override
	public inventoryBean getInventoryById(int id) {
		inventoryBean inventorybean = new inventoryBean();
		Optional<inventoryEntity> inventoryEntity = inventoryRepository.findById(id);
	
		if(inventoryEntity != null && !"".equals(inventoryEntity))
		BeanUtils.copyProperties(inventoryEntity.get(), inventorybean);
		return inventorybean;
	}
	
	@Override
	public List<inventoryBean> getListOfInventoryList() {
		List<inventoryEntity> listOfInventoryEntity = (List<inventoryEntity>) inventoryRepository.findAll();
		List<inventoryBean> listOfInventoryBean = null;
		if(listOfInventoryEntity!=null && !listOfInventoryEntity.isEmpty()) {
			listOfInventoryBean = new ArrayList();
			for(inventoryEntity inventoryEntity :listOfInventoryEntity) {
				inventoryBean inventorybean = new inventoryBean();
				BeanUtils.copyProperties(inventoryEntity, inventorybean);
				listOfInventoryBean.add(inventorybean);
			}
		}
		return listOfInventoryBean;
	}
	
//	public List<inventoryBean> getListOfBikeName() {
//		List<inventoryEntity> listOfInventoryEntity = (List<inventoryEntity>) inventoryRepository.getbikeName();
//		List<inventoryBean> listOfInventoryBean = null;
//		if(listOfInventoryEntity!=null && !listOfInventoryEntity.isEmpty()) {
//			listOfInventoryBean = new ArrayList();
//			for(inventoryEntity inventoryEntity :listOfInventoryEntity) {
//				inventoryBean inventorybean = new inventoryBean();
//				BeanUtils.copyProperties(inventoryEntity, inventorybean);
//				listOfInventoryBean.add(inventorybean);
//			}
//		}
//		return listOfInventoryBean;
//	}

	@Override
	public List<inventoryBean> getListofAvailableInventorys() {
		List<inventoryBean> listOfInventorys = getListOfInventoryList();
		List<inventoryBean> listOfInventoryBean = new ArrayList();;
		for(inventoryBean inventorybean : listOfInventorys) {
			List<customerEntity> customerentity = customerrepository.getCustomerByInventoryId(inventorybean.getInventoryId());
			if(customerentity.size()==0) {
				listOfInventoryBean.add(inventorybean);
			}
		}
		return listOfInventoryBean;
	}

	@Override
	public List<inventoryEntity> getBikeNumbersByBikeName(String name) {
		if(name!=null) {
			List<inventoryEntity> BikeNumbers = inventoryRepository.findByBikeName(name);
			return BikeNumbers;
		}
		return null;
	}



}
