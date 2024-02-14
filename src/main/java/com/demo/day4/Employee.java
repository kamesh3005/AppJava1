package com.demo.day4;

public class Employee {
	private int employeeId;
	private String employeeName;
	private int salary;

	public Employee() {
		employeeId = 1234;
		employeeName = "Tom";
		salary = 20000;
	}

	public Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public Employee(int employeeId, String employeeName, int salary) {
	//Constructor call must be the first statement in a constructor
		this(employeeId, employeeName);
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// toString return the string representation of an object
	// overriding the toString method of an Object class
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}

	
	
	
}
