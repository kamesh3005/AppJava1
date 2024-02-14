package com.demo.day1;

public class Welcome {

	public static void main(String[] args) {
		System.out.println("Welcome");
		byte a=10,b=20;
		//Type mismatch: cannot convert from int to byte
		//byte c=a+b;
		int c=a+b;
		System.out.println(c);
		if (a >b) {
			System.out.println("a is greater than B");
		}
 		System.out.println("End of program");
	}

}
