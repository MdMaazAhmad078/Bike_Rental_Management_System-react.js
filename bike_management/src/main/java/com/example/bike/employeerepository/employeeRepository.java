package com.example.bike.employeerepository;

import org.springframework.data.repository.CrudRepository;

import com.example.bike.employee.entity.employeeEntity;

public interface employeeRepository extends CrudRepository<employeeEntity, Integer>{

}
