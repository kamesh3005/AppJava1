package com.demo.day6;

public class StringDemo3 {

	public static void main(String[] args) {
		//A  - 65   a-97     
		String s1 =new String("hello");
		String s2= new String("hai");
		
		int res =s1.compareTo(s2);
		System.out.println(res);
		System.out.println(s2.compareTo(s1));
		
		String s3=new String("Hello");
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s1));
		System.out.println(s1.compareToIgnoreCase(s3));
		//  s1<s2  -1, s1>s2  1  s1==s2  0
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		
		String  str1 ="This is for testing.javac is  a compiler.java is simple.java is secure";
		
		int pos =str1.indexOf('i');
		System.out.println(pos);
		System.out.println(str1.indexOf("is"));
		System.out.println(str1.indexOf("java"));
		
		System.out.println(str1.indexOf('H'));
		
		System.out.println(str1.indexOf("Good"));
		
		System.out.println(str1.indexOf("is", 8));
		System.out.println("--------------------");
		//lastIndexOf  -- search  start from last to first
		
		System.out.println(str1.lastIndexOf("is"));
		System.out.println(str1.lastIndexOf("java", 54));
 
	}

}
