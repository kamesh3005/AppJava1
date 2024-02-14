package com.demo.exceptions;

import java.text.ParseException;
import java.util.Date;

public class UtilityMain {

	public static void main(String[] args) {
		//Unhandled exception type ParseException
		//Utility.strToDate("15/12/2004", "dd/MM/yyyy");
		try {
			Date date = Utility.strToDate("15/12/2004", "dd/MM/yyyy");
			System.out.println("Valid date " + date);
		} catch (ParseException e) {
			System.out.println("Invalid Date ..." + e.getMessage());
		}
		//Utility.divide(12, 4);

		try {
			int q = Utility.divide(12, 4);
			System.out.println(q);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

//		NullPointerException e = new  NullPointerException("it is null.no value assigned");
//		throw e;

//		int a =10,b=-20;
//		if (a <0 || b <0) {
//			
//			throw new  ArithmeticException("Negative  values");
//		}

	}

}
