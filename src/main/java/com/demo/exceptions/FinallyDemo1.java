package com.demo.exceptions;

import java.util.Scanner;

public class FinallyDemo1 {

	public static void main(String[] args) {
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
		  if ( quotient >5) {
			 // return;
			  System.exit(0);
		  }
		}
		catch(ArithmeticException e) {
			System.out.println("inside the catch block");
 			System.out.println(e.getMessage());
			quotient =num1;
			System.exit(0);
		}
		finally {
			System.out.println("It is finally block - ");
		}
		System.out.println("Quotient = " +quotient);
		System.out.println("----- end of program-----");
 
	 
	}

}
