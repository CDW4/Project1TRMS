package com.revature.pojos;

public class Employee {
	
	private String username; 
	
	private String accountpassword; 
	
	private String firstName; 
	
	private String lastName;
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return accountpassword;
	}

	public void setPassword(String password) {
		this.accountpassword = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String username, String password, String firstName, String lastName) {
		super();
		this.username = username;
		this.accountpassword = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Employee(String username, String password) {
		super();
		this.username = username;
		this.accountpassword = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((accountpassword == null) ? 0 : accountpassword.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (accountpassword == null) {
			if (other.accountpassword != null)
				return false;
		} else if (!accountpassword.equals(other.accountpassword))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [username=" + username + ", password=" + accountpassword + ", firstName=" + firstName + ", lastName="
				+ lastName + "]";
	} 

}
