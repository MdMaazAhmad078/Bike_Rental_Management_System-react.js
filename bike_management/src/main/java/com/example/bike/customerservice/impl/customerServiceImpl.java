package com.example.bike.customerservice.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bike.customer.bean.customerBean;
import com.example.bike.customer.entity.customerEntity;
import com.example.bike.customer.repository.customerRepository;
import com.example.bike.customer.service.customerService;

@Service
public class customerServiceImpl implements customerService {

	@Autowired
	private customerRepository customerRepository;
	
	@Override
	public customerBean createCustomer(customerBean customerbean)
	{
		customerEntity customerEntity= null;
		if(customerbean!=null)
		{
			customerEntity = new customerEntity();
			BeanUtils.copyProperties(customerbean, customerEntity);
			customerRepository.save(customerEntity);
		}
		if(customerEntity!=null)
		{
			customerbean = new customerBean();
			BeanUtils.copyProperties(customerEntity, customerbean);
			return customerbean;
		}
		return null;
	}
	
	@Override
	public void deleteCustomerById(int id)
	{
		if(id!=0)
		{
			customerRepository.deleteById(id);
		}
	}
	
	@Override
	public customerBean getCustomerById(int id) {
		customerBean customerbean = new customerBean();
		Optional<customerEntity> customerEntity = customerRepository.findById(id);
	
		if(customerEntity != null && !"".equals(customerEntity))
		BeanUtils.copyProperties(customerEntity.get(), customerbean);
		return customerbean;
	}
	
	@Override
	public List<customerBean> getListOfCustomerList() {
		List<customerEntity> listOfCustomerEntity = (List<customerEntity>) customerRepository.findAll();
		List<customerBean> listOfCustomerBean = null;
		if(listOfCustomerEntity!=null && !listOfCustomerEntity.isEmpty()) {
			listOfCustomerBean = new ArrayList();
			for(customerEntity customerEntity :listOfCustomerEntity) {
				customerBean customerbean = new customerBean();
				BeanUtils.copyProperties(customerEntity, customerbean);
				listOfCustomerBean.add(customerbean);
			}
		}
		return listOfCustomerBean;
	}


	}


