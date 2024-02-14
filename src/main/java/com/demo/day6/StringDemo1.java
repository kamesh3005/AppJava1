package com.demo.day6;

public class StringDemo1 {

	public static void main(String[] args) {

		String str1 = new String("Welcome to Java Programming");
		char[] ch = { 'H', 'E', 'L', 'L', 'O', 'F', 'R', 'I', 'E', 'N', 'D', 'S' };
		String str2 = new String(ch);
		System.out.println(str2);
		String str3 = new String(ch,2,7);
		System.out.println(str3);
		byte []b = {65,66,67,68,69,70};
		String str4 = new String(b);
		System.out.println(str4);
		
		int len = str1.length();
		System.out.println("Length of a string : " +len);
		
		str1.toUpperCase();
		System.out.println(str1);
		System.out.println("--------------------------");
		String s2 = str1.toUpperCase();
		
		System.out.println(str1);
		System.out.println(s2);
		System.out.println("------------------");
		String  s3 =str1.toLowerCase();
		System.out.println(str1);
		System.out.println(s3);
		
		char  ch1 = str1.charAt(3);
		System.out.println(ch1);
		
		//methods using  index  -   StringIndexOutOfBoundsException
		
	//	System.out.println(str1.charAt(28));
		
		//length - 27  ie  0 to 26 only index  , 28 -Exception
		
		
		
	}

}
