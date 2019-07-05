package com.revature.services;

import com.revature.dao.EmployeeDAO;
import com.revature.dao.EmployeeDaoImp;
import com.revature.pojos.Employee;

public class EmployeeServicesImp implements EmployeeServices {
	
	private static EmployeeDAO edao = new EmployeeDaoImp();

	public Employee userLogin(String username, String password) {
		

		Employee employee = null;
		for(Employee emp : edao.getAllEmployees()) {
		
		if (emp.getUsername().equals(username) && emp.getPassword().equals(password)) {
			employee = emp ;
			}
		
		}
		return employee;
	}
	
	public Employee userRetrieve(Employee employee) {
		
		Employee employ = edao.getEmployeeUsername(employee);

		return employ;
		
	}
	
}
