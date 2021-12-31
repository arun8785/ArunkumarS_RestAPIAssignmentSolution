package com.greatlearning.security.EmployeeManagementSecurity.service;

import java.util.List;

import com.greatlearning.security.EmployeeManagementSecurity.entity.Employee;


public interface EmployeeService {
	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteById(int theId);

	public List<Employee> searchBy(String firstname, String email);

}
