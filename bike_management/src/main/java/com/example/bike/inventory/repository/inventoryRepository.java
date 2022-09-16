package com.example.bike.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.bike.inventory.entity.inventoryEntity;

public interface inventoryRepository  extends CrudRepository<inventoryEntity, Integer> {
	
	@Query("from inventoryEntity where bikeName=:name")
	List<inventoryEntity> findByBikeName(String name);

	inventoryEntity findByBikeNumber(String bikeNumber);
	
//	@Query(value = "FROM inventoryEntity  COUNT(bikeName) == 1")
//	List<inventoryEntity> getbikeName();

}
