package com.greatlearning.security.EmployeeManagementSecurityrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.security.EmployeeManagementSecurity.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByFirstNameContainsAndEmailContainsAllIgnoreCase(String firstname,String email);
	
}
