package com.luv2code.mvcapp.mvcspringdatajpa.service;

import java.util.List;

import com.luv2code.mvcapp.mvcspringdatajpa.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public void save(Employee employee);
	
	public void deleteById(int theId);
	
	
}
