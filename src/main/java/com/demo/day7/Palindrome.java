package com.demo.day7;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner  sc = new  Scanner(System.in);
		System.out.println("Enter String");
		String  str1 =sc.nextLine();
		
		StringBuffer  sb1 = new StringBuffer(str1);
		sb1.reverse();
		String str2=sb1.toString();
		 if (str1.equals(str2)) {
			 System.out.println("Given String is Palindrome");
		 }
		 else {
			 System.out.println("Given String is not a Palindrome");
		 }
		
 
	}

}
