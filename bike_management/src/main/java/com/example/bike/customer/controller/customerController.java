package com.example.bike.customer.controller;

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


@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Controller")
public class customerController {
	
	@Autowired
	customerService customerService;
	
	
	@PostMapping(value="/CreateCustomer")
	public void createCustomer(@RequestBody customerBean customerBean)
	{
		customerService.createCustomer(customerBean);
	}
	
	@DeleteMapping(value="/DeleteCustomer/{id}")
	public void deleteCustomerbyId(@PathVariable("id") int id) {
		customerService.deleteCustomerById(id);
	}
	
	@PostMapping(value="GetCustomerByID/{id}")
	public customerBean getCustomerbyId(@PathVariable("id") int id)
	{
		return customerService.getCustomerById(id);
	}
	
	@GetMapping(value=" GetListOfCustomer")
	public List<customerBean> getListOfCustomerList()
	{
		return customerService.getListOfCustomerList();
	}

}
