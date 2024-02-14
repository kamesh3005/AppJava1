package com.demo.day4;

public class EmployeeMain1 {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
	//emp1.employeeId=1001;
		//emp1.employeeName="Tom";
		int x=10;
		System.out.println(x);
		System.out.println(emp1);
		
		Employee emp2 = new Employee();
		System.out.println(emp2);  //implicitly call the toString() method
		
		System.out.println(emp1.getClass());
		
		int a=10,b=20;
		System.out.println(a+b);
		System.out.println("sum ="+a+b);
		System.out.println(a+b +" is the sum");
		System.out.println("sum = "+(a+b));
		
		Employee  emp3 = new Employee(3344, "Jerry", 20000);
		System.out.println(emp3);
		emp3.setSalary(22000);
		System.out.println(emp3);
		
		Employee  emp4 = new Employee(4455, "Kamesh");
		System.out.println(emp4);
	}

}
