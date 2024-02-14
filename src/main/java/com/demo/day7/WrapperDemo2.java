package com.demo.day7;

public class WrapperDemo2 {

	public static void main(String[] args) {

		// String to int primitive data type conversion
		String str1 = "56789";
		int num = Integer.parseInt(str1);
		System.out.println(num);

		// convert binary string to decimal (int primitive data type)
		String bStr1 = "1001";
		int num1 = Integer.parseInt(bStr1, 2);
		System.out.println(num1);

		int num2 = Integer.parseInt("32", 8);
		System.out.println(num2);

		int num3 = Integer.parseInt("3A", 16);
		System.out.println(num3);

		// int to String
		String binaryStr = Integer.toBinaryString(32);
		System.out.println(binaryStr);
		String octStr = Integer.toOctalString(26);
		System.out.println(octStr);
		String hexStr = Integer.toHexString(58);
		System.out.println(hexStr);
		String  s1 =Integer.toString(344);
		System.out.println(s1);
		String  s2 =Integer.toString(22, 2); // to binary
		System.out.println(s2);
		String  s3 =Integer.toString(22, 8); // to octal
		System.out.println(s3);
		String  s4 =Integer.toString(31, 16); // tohex
		System.out.println(s4);

	}

}
