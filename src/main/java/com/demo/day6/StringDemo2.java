package com.demo.day6;

public class StringDemo2 {

	public static void main(String[] args) {
		String  str1 =new String("WELCOME To java PROGRAMMING. ");
		
		String s1=str1.concat("java is simple");
		System.out.println(str1);
		System.out.println(s1);
		
		
		String s=str1.concat("java is simple").toUpperCase();
		System.out.println(s);
		System.out.println(str1.isEmpty());
		
		boolean res =str1.contains("GRAM");
		System.out.println(res);
		
		String  s2 =str1.substring(5);
		System.out.println(s2);
		//start from 5th to 11th
		//alwas exclude the end index
		String s3 = str1.substring(5,12);
		System.out.println(s3);
		
		String  str2=new String("  Hello Friends  ");
		System.out.println(str2.length());
		
		
		String s4 = str2.trim();
		System.out.println(s4.length());
		 char [] chArray = s4.toCharArray();
		 for (char c : chArray) {
			//System.out.println(c);
		}
		
		 
		 boolean result=  str1.startsWith("WEL");
		 System.out.println(result);
		 result =str1.startsWith("HELLO");
		 System.out.println(result);
		 System.out.println(str1.endsWith("ING. "));
		 
		 String s5="one";
		 String s6="two";
		 s6+=s5;
		 System.out.println(s6);
		 
		 String  s7=null;
		System.out.println( s7.valueOf(10)); 
		String s8=new String("5");
		
		System.out.println(1+10+s8+1+10);
		
//		switch(s7) {
//		case "null" :
//			System.out.println("null");
//			break;
//		}
		
		System.out.println(s7);
		System.out.println(s7.toString());
		
		
	}
	
	

}
