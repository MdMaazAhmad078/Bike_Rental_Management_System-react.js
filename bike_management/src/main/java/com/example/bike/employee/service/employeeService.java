package com.example.bike.employee.service;

import java.util.List;

import com.example.bike.employee.bean.employeeBean;

public interface employeeService {
	public void createEmployee(employeeBean employeeBean);
	public employeeBean getEmployeeById(int id);
	public List<employeeBean> getListOfEmployeeList();
	public void deleteEmployeeById(int id);
}
