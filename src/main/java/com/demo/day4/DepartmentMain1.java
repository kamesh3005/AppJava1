package com.demo.day4;

public class DepartmentMain1 {

	public static void main(String[] args) {

		Department d1 = new Department(10, "Maths", "Chennai");
 		Department d3 = new Department(20, "Accounts", "Chennai");
		 Department d4 =d1;
		 System.out.println(d1);
		 System.out.println(d4);
		 d4.setLocation("Mumbai");
		 System.out.println("------------");
	 
		 System.out.println(d1);
		 System.out.println(d4);    // object reference count is 2
		 
		 d4 =null;   /// object reference count is 1
		 d1=null;  //object reference count 0, so it is eligible for garbage collection
		 
		System.gc();
		
		Runtime.getRuntime().gc();

		
 	}

}
