package com.demo.day7;

import java.util.Date;

public class DateDemo1 {

	public static void main(String[] args) {

		Date today = new Date();
		System.out.println(today);
		// Returns the number of milliseconds
		// since January 1, 1970, 00:00:00 GMT represented by this Date object.
		long tim = today.getTime();

		System.out.println(tim);
		// 1second =1000ms
		// 1minute =60 second 1hour =60minute 1day =24hour
		Date d1 = new Date(1000);
		System.out.println(d1);

		Date d2 = new Date(1000 * 60);
		System.out.println(d2);

		d2 = new Date(1000 * 60 * 60);
		System.out.println(d2);

		d2 = new Date(1000 * 60 * 60 * 24);
		System.out.println(d2);

		
		d2 = new Date(1000 * 60 * 60 * 24*365l);
		System.out.println(d2);
		
		d2 = new Date(1000 * 60 * 60 * 24*365l*30);
		System.out.println(d2);
	}

}
