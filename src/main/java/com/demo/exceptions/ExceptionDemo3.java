package com.demo.exceptions;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		int num1 = 10, num2 = 0;
		int quotient = 0;
		int []arr = {10,20,30,40,50};
		try {
			System.out.println("inside try block");
			quotient = num1 / num2;
			System.out.println("Quotient = " + quotient);
			int value =arr[quotient];
			System.out.println("value = "+value);
			System.out.println("end of try block");
		} catch (ArithmeticException e) {
			System.out.println("inside the catch block");
			System.out.println(e);
			System.out.println(e.getMessage());
			quotient = num1;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error Occurs");
			System.out.println(e);
 		}
		System.out.println("Quotient = " + quotient);
		System.out.println("----- end of program-----");

	}

}
