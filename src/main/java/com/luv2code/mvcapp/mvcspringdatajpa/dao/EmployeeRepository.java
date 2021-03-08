package com.luv2code.mvcapp.mvcspringdatajpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.mvcapp.mvcspringdatajpa.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it... no need to write any code LOL!	
	
	// "from Employee order by lasName asc"
	public List<Employee> findAllByOrderByLastNameAsc();
	
}
