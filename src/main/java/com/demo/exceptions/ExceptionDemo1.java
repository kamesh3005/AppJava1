package com.demo.exceptions;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		//ArithmeticException e1 = new ArithmeticException();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2 =sc.nextInt();
		int quotient;
		try {
			System.out.println("inside try block");
		//java.lang.ArithmeticException: / by zero  num=10, num2=0
		   quotient =num1/num2;
		 System.out.println("Quotient = " +quotient);
		}
		catch(ArithmeticException e) {
			System.out.println("inside the catch block");
			System.out.println(e);
			System.out.println(e.getMessage());
			quotient =num1;
		}
		System.out.println("Quotient = " +quotient);
		System.out.println("----- end of program-----");
 
	 
	}

}
