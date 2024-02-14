package com.demo.exceptions;

public class Customer {

	private int customerId;
	private String customerName;
	private int age;

	private Customer() {
		// TODO Auto-generated constructor stub
	}

	private Customer(int customerId, String customerName, int age) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.age = age;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", age=" + age + "]";
	}

	// id,name,age
	public static Customer createCustomer(String str) throws InvalidAgeException    {
		String[] data = str.split(",");
		int id = Integer.parseInt(data[0]);
		int age = Integer.parseInt(data[2]);
		String name = data[1];
		if (age < 18) {
			throw new InvalidAgeException("Age should be >=18");
		}

		Customer customer = new Customer(id, name, age);
		return customer;

	}

}
