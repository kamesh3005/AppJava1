package com.demo.day9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class LocalDateDemo3 {

	public static void main(String[] args) {
		
		LocalTime  time = LocalTime.now();
		LocalDate  dob=LocalDate.parse("2004-12-15");
		
		LocalDateTime  dt =dob.atTime(time);
		System.out.println(dt);
		
		
		LocalDate  today =LocalDate.now();
		
		Period  period =dob.until(today);
		System.out.println(period.getYears()+" Years " + period.getMonths() +" Months " +period.getDays() +" days");
		
		if (period.getYears() >=18) {
			System.out.println("Eligible for voting");
		}
		else {
			System.out.println("Not eligible for voting");
		}
		
		System.out.println(dob.isAfter(today));
		System.out.println(dob.isBefore(today));
		System.out.println(dob.compareTo(today));
		System.out.println(today.compareTo(dob));
		System.out.println(today.isEqual(dob));
 
	}

}
