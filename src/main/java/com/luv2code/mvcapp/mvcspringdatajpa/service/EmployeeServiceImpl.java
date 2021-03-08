package com.luv2code.mvcapp.mvcspringdatajpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.mvcapp.mvcspringdatajpa.dao.EmployeeRepository;
import com.luv2code.mvcapp.mvcspringdatajpa.entity.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	// no need transactional anotation => inside of jpa
	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAllByOrderByLastNameAsc();
	}

	@Override
	public Employee findById(int id) {
		
		// Jpa repository makes use of optionals
		Optional<Employee> employee =  employeeRepository.findById(id);
		
		if(employee.isPresent()) {
			return employee.get();
		}
		return null;
	}

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		employeeRepository.deleteById(theId);
	}

}
