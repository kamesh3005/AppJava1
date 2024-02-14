package com.demo.exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/*
 * There is no matching exception handler in the  inner try block
 */
public class ExceptionDemo7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Dob (dd/MM/yyyy)");
		String str = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//cheked  excpetion
		sdf.setLenient(false);
		    try {
				Date  dob = sdf.parse(str);
				System.out.println("Valid Date: " +dob);
			} catch (ParseException e) {
				System.out.println("Invalid Date ...." +e); 
			}finally {
				
				sc.close();
				System.out.println("It is  finally block");
			}
		System.out.println("End of Program");

	}

}
