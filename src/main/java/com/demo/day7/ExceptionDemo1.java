package com.demo.day7;

import java.io.FileReader;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// Unhandled exception type  FileNotFoundException
		//checked exception
 // FileReader reader =  new FileReader("sample.txt"); 
		//runtime -  ArithmeticException
		//it won't force the programmer to handle the exception - unchecked
//		int  res =7/0;
//		System.out.println(res);
		
		
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int  n1 =sc.nextInt();
		int n2=sc.nextInt();
		int q =n1/n2;
		int rem =n1%n2;
		//if n2==0 , then it throw an exception ArithmeticException
		System.out.println("Quotient = " +q+" Remainder = "+rem);
	}

}
