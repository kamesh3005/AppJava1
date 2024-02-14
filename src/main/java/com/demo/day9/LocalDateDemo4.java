package com.demo.day9;

import java.time.LocalDate;
import java.util.Scanner;

public class LocalDateDemo4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date yyyy-MM-dd");
		String str =sc.nextLine();
		
		LocalDate  dob =LocalDate.parse(str);
		
		
		LocalDate  d1 =dob.plusYears(18);
		System.out.println(d1);
		
		LocalDate  today = LocalDate.now();
		
		if (today.isAfter(d1) ||  today.isEqual(d1)){
			System.out.println("Eligible for voting");
		}
		else {
			System.out.println("Not eligible for voting");
		}
		
 
	}

}
