package com.demo.day7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {

	public static void main(String[] args) {
		SimpleDateFormat  sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		SimpleDateFormat  sdf2 = new SimpleDateFormat("dd/MM/yyyy  hh:mm:ss a");
		
		SimpleDateFormat  sdf3 = new SimpleDateFormat("dd-MMM-yyyy EEE");
		SimpleDateFormat  sdf4 = new SimpleDateFormat("dd-MMMM-yyyy EEEE");
		SimpleDateFormat  sdf5 = new SimpleDateFormat("dd-MMM-yyyy EEE  HH:mm:ss:S");
		
		Date today = new Date();
		System.out.println(today);
		//date to String
		String str1 =sdf1.format(today);
		System.out.println(str1);
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		System.out.println(sdf5.format(today));

        

	


	}

}
