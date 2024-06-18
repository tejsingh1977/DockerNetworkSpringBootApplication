package com.wipro.ecms.service;

import java.util.List;

import com.wipro.ecms.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void insertEmployee(Employee employee);
}