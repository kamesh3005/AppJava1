package com.demo.exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {

	//checked exception
	public static Date strToDate(String str, String format) throws ParseException  {
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		Date date = formatter.parse(str);
		return date;
	}
	
	//unchecked  exception
	public  static  int divide (int operand1 , int operand2) throws  ArithmeticException {
		int  quotient = operand1/operand2;
		return  quotient;
	}
	
	

}
