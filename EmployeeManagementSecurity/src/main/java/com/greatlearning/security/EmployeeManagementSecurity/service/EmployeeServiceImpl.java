package com.greatlearning.security.EmployeeManagementSecurity.service;

import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.greatlearning.security.EmployeeManagementSecurity.entity.Employee;
import com.greatlearning.security.EmployeeManagementSecurityrepository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;





@Service
public class EmployeeServiceImpl implements EmployeeService {


	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		List<Employee> employees=employeeRepository.findAll();
		return employees;
	}

	@Override
	public Employee findById(int theId) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(theId).get();
	}

	@Override
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		employeeRepository.save(theEmployee);
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(theId);
		
	}

	@Override
	public List<Employee> searchBy(String firstname, String email) {
		// TODO Auto-generated method stub
		List<Employee> employees=employeeRepository.findByFirstNameContainsAndEmailContainsAllIgnoreCase(firstname, email);
		return employees;
	}





}
