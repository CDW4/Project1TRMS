package com.revature.dao;

import java.util.List;

import com.revature.pojos.Employee;

public interface EmployeeDAO {
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeUsername(Employee employee);

}
