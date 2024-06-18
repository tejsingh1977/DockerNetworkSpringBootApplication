package com.wipro.ecms.dao;

import java.util.List;

import com.wipro.ecms.model.Employee;

public interface EmployeeDao {
	List<Employee> getAllEmployees();
	void insertEmployee(Employee employee);
}