package com.demo.day4;

public class DepartmentMain {

	public static void main(String[] args) {

		Department d1 = new Department(10, "Maths", "Chennai");
		Department d2 = new Department(10, "Maths", "Chennai");
		Department d3 = new Department(20, "Accounts", "Chennai");
		
	// d1==d2  // you are comparing the references of two object
		if (d1.getDepartmentId() ==d2.getDepartmentId()  && 
				d1.getDepartmentName().equals(d2.getDepartmentName())
				&&  d1.getLocation().equals(d2.getLocation())) {
			System.out.println("d1 equals to d2 - bith are having same content");
		}
		else {
			System.out.println("d1 and d2 are Not equal");
		}
		
		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d3));
		

		
 	}

}
