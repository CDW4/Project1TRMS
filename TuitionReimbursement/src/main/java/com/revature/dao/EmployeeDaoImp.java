package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.pojos.Employee;
import com.revature.util.ConnectHub2;

public class EmployeeDaoImp implements EmployeeDAO{

	Connection conn = ConnectHub2.getConnection();

	public Employee getEmployeeUsername(Employee employee) {

		String sql = "select * from employee where username = '" + employee.getUsername() + "'";

		Employee getUser = null;

		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			if(rs.next()) { 
				getUser = new Employee(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
			} 

		} catch (SQLException e) {
				e.printStackTrace();
			}

		return getUser;
	}
	
	public List<Employee> getAllEmployees() {
       
//		Employee employee = null;

		List<Employee> listOfUsers = new ArrayList<Employee>();

		String sql = "select username, accountpassword from employee";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while(rs.next()) { 
				listOfUsers.add(new Employee(rs.getString(1), rs.getString(2)));
			} 

		} catch (SQLException e) {
				e.printStackTrace();
			}

		return listOfUsers;

    }

	
}
