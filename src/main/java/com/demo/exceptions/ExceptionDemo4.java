package com.demo.exceptions;

import java.util.Scanner;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		int num1 = 10, num2 = 5;
		int quotient = 0;
		int[] arr = { 10, 20, 30, 40, 50 };
		try {
			System.out.println("inside try block");
			quotient = num1 / num2;
			System.out.println("Quotient = " + quotient);
			int value = arr[quotient];
			System.out.println("value = " + value);
			String s = null;
			System.out.println(s.length());   //NullPointerException
		}

		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("inside the catch block");
			System.out.println(e);
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// capable of handling all type of exception
//super class exception handler - always it should be at the last
			System.out.println("error........." + e);
		}
		System.out.println("Quotient = " + quotient);
		System.out.println("----- end of program-----");

	}

}
