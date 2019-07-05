package com.revature.services;

import com.revature.pojos.Employee;

public interface EmployeeServices {
	
	public Employee userLogin(String username, String password);
	
	public Employee userRetrieve(Employee employee);

}
