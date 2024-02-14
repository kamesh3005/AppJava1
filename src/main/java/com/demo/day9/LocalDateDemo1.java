package com.demo.day9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo1 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		
		LocalDate  d1 =LocalDate.parse("2014-12-15");
		System.out.println(d1);
		//java.time.format.DateTimeParseException: - unchecked exception
//		  d1 =LocalDate.parse("2014-12-35");
//		System.out.println(d1);
		
		//string to date
		String s1 ="24/09/2007";
		
		DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate  d2 =LocalDate.parse(s1,formatter);
		System.out.println(d2);
		//date to string
		
		String  str1 =today.format(formatter);
		System.out.println(str1);
		
		
		LocalDate  d3=LocalDate.of(2000, 10, 30);
		System.out.println(d3);
		
		
	}

}
