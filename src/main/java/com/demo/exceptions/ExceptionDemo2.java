package com.demo.exceptions;

public class ExceptionDemo2 {
//if there is no matching exception handler, then the exception object will be thrown to the run time enviornment
	public static void main(String[] args) {
		int num1 = 10, num2 = 0;
		int quotient;
		try {
			System.out.println("inside try block");
			quotient = num1 / num2;
			System.out.println("Quotient = " + quotient);
		} catch (NullPointerException e) {
			System.out.println("inside the catch block");
			System.out.println(e);
			System.out.println(e.getMessage());
			quotient = num1;
		}
		System.out.println("Quotient = " + quotient);
		System.out.println("----- end of program-----");

	}

}
