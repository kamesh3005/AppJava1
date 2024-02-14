package com.demo.day9;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo2 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		int days =today.getDayOfMonth();
		int mnt =today.getMonthValue();
		int year =today.getYear();
		System.out.println(days +"....." +mnt +"....." +year);

		Month mnth =today.getMonth();
		System.out.println(mnth.name());
		
		DayOfWeek  dow = today.getDayOfWeek();
		System.out.println(dow.name());
		
		System.out.println(today.get(ChronoField.DAY_OF_MONTH));
		System.out.println(today.get(ChronoField.MONTH_OF_YEAR));
		System.out.println(today.get(ChronoField.YEAR));
		//immutable
		today.plusDays(10);
		System.out.println(today);
		System.out.println("--------------");
		
		LocalDate d1 =today.plusDays(10);
		System.out.println(today);
		System.out.println(d1);
		
		d1 =today.plusMonths(2);
		System.out.println(d1);
		d1 =today.plusYears(10);
		System.out.println(d1);
		
		d1 = today.plusDays(10).plusMonths(2).plusYears(10);
		System.out.println(d1);
		
		
		//same this for minus
		
		d1 =today.minusDays(10);
		System.out.println(d1);
		
		
		
		d1 =today.plus(10, ChronoUnit.DAYS);
		System.out.println(d1);
		
		System.out.println(today.minus(10,ChronoUnit.MONTHS));
		
		//getMonthValue ,getDays
		
		//with - change the individual fields
		
		 LocalDate  d2=today.withYear(2000);
		 System.out.println(d2);
		 
		 System.out.println(today.withMonth(4));
		 
		 d2=today.withYear(2002).withMonth(3).withDayOfMonth(21);
		 System.out.println(d2);
		 
		 System.out.println("Length of the Months : " +today.lengthOfMonth());
		 
		  System.out.println(today.isLeapYear());
		  
		  LocalDate dob =LocalDate.parse("2020-04-15");
		  System.out.println(dob.isLeapYear());
		  
		  
		  LocalDateTime  dt = dob.atTime(11, 40, 20);
		  System.out.println(dt);
		  
		  
		  
		 
		
	}

}
