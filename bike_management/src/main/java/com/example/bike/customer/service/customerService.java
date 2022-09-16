package com.example.bike.customer.service;

import java.util.List;

import com.example.bike.customer.bean.customerBean;

public interface customerService {
	public customerBean createCustomer(customerBean customerBean);
	public customerBean getCustomerById(int id);
	public List<customerBean> getListOfCustomerList();
	public void deleteCustomerById(int id);
	
}
