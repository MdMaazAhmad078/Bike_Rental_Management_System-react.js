package com.example.bike.employee.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bike.employee.bean.employeeBean;
import com.example.bike.employee.entity.employeeEntity;
import com.example.bike.employee.service.employeeService;
import com.example.bike.employeerepository.employeeRepository;
@Service
public class employeeServiceImpl implements employeeService {
	
	@Autowired
	private employeeRepository  employeeRepository;
	
	@Override
	public void createEmployee(employeeBean  employeeBean)
	{
		employeeEntity  employeeEntity = new employeeEntity();
		if( employeeBean != null)
		BeanUtils.copyProperties( employeeBean,  employeeEntity);
		 employeeRepository.save( employeeEntity);

		
		
	}
	
	@Override
	public void deleteEmployeeById(int id)
	{
		if(id!=0)
		{
			 employeeRepository.deleteById(id);
		}
	}

	
	
	@Override
	public employeeBean getEmployeeById(int id) {
		employeeBean  employeeBean = new employeeBean();
		Optional<employeeEntity>  employeeEntity =  employeeRepository.findById(id);
	
		if( employeeEntity != null && !"".equals( employeeEntity))
		BeanUtils.copyProperties( employeeEntity.get(),  employeeBean);
		return  employeeBean;
	}
	
	@Override
	public List<employeeBean> getListOfEmployeeList() {
		List<employeeEntity> listOfEmployeeEntity = (List<employeeEntity>)  employeeRepository.findAll();
		List<employeeBean> listOfEmployeeBean = null;
		if(listOfEmployeeEntity!=null && !listOfEmployeeEntity.isEmpty()) {
			listOfEmployeeBean = new ArrayList();
			for(employeeEntity  employeeEntity :listOfEmployeeEntity) {
				employeeBean  employeeBean = new employeeBean();
				BeanUtils.copyProperties( employeeEntity,  employeeBean);
				listOfEmployeeBean.add( employeeBean);
			}
		}
		return listOfEmployeeBean;
	}


}
