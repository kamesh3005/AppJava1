package com.demo.exceptions;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// ArithmeticException e1 = new ArithmeticException();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int quotient;
		quotient = num1 / num2;
		System.out.println("Quotient = " + quotient);
		System.out.println("----- end of program-----");

	}

}
