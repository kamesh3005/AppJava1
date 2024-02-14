package com.demo.day8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo3 {

	public static void main(String[] args) {
		// String to Date

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");

	//	String str1 = "15/12/2004";
		String str1 = "15/15/2004";
		sdf1.setLenient(false);

		try {
			Date d1 = sdf1.parse(str1);
			System.out.println("Valid Date");
			System.out.println(d1);
		} catch (ParseException e) {
			System.out.println("Invalid Date Format :" +e.getMessage());
		 
		}

	}

}
