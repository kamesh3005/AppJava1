package com.demo.exceptions;

import java.util.Scanner;

public class CustomerMain {
	public static void main(String[] args) {
		//The constructor Customer() is not visible
		//Customer  c1 = new  Customer();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id,name,age");
		String str =sc.next();
		
		try {
			Customer customer=   Customer.createCustomer(str);
			System.out.println("Customer created successfully");
			System.out.println(customer);
		} catch (InvalidAgeException e) {
			System.out.println("Customer creation failure");
			 System.out.println(e);
		}
	}

}
