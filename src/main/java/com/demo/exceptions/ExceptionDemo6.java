package com.demo.exceptions;

import java.util.Scanner;
/*
 * There is no matching exception handler in the  inner try block
 */
public class ExceptionDemo6 {
	public static void main(String[] args) {
		int num1 = 10, num2 = 2;
		int quotient = 0;
		int[] arr = { 10, 20, 30, 40, 50 };
		try {
			System.out.println("inside outer  try block");
			quotient = num1 / num2;
			System.out.println("Quotient = " + quotient);
			try {
				System.out.println("inside inner  try block");
				int value = arr[quotient];
				System.out.println("value = " + value);
				System.out.println("end of inner   try block");
			} catch (NullPointerException e) {
				System.out.println("inside the inner  catch block");
				System.out.println(e);
			}
			System.out.println("end of  outer  try blocl");
		}
		catch (ArithmeticException e) {
			System.out.println("inside the outer  catch block");
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("inside the outer  catch block");
			System.out.println(e);
		}

		System.out.println("Quotient = " + quotient);
		System.out.println("----- end of program-----");

	}

}
