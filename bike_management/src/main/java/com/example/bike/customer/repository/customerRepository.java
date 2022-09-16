package com.example.bike.customer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.bike.customer.entity.customerEntity;



public interface customerRepository extends CrudRepository<customerEntity, Integer> {
	
	@Query("from customerEntity where InventoryId=:inventoryId")
	List<customerEntity> getCustomerByInventoryId(int inventoryId);
	

}
