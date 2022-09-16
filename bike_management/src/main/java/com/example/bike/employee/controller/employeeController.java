package com.example.bike.employee.controller;

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

import com.example.bike.employee.bean.employeeBean;
import com.example.bike.employee.service.employeeService;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Controller")
public class employeeController {
	
	@Autowired
	employeeService employeeService;
	
	
	@PostMapping(value="/CreateEmployee")
	public void createEmployee(@RequestBody employeeBean employeeBean)
	{
		employeeService.createEmployee(employeeBean);
	
	}
	@DeleteMapping(value="/DeleteEmployee/{id}")
	public void deleteEmployeebyId(@PathVariable("id") int id) {
		employeeService.deleteEmployeeById(id);
	}
	
	@PostMapping(value="GetEmployeeByID/{id}")
	public employeeBean getEmployeebyId(@PathVariable("id") int id)
	{
		return employeeService.getEmployeeById(id);
	}
	
	@GetMapping(value=" GetListOfEmployee")
	public List<employeeBean> getListOfEmployeeList()
	{
		return employeeService.getListOfEmployeeList();
	}


}
