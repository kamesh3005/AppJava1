package com.demo.day7;

public class WrapperDemo5 {

	public static void main(String[] args) {
		Character ch1 = new Character('A');
		System.out.println(ch1.charValue());

		char ch2 = 'D';
		boolean res = Character.isUpperCase(ch2);
		System.out.println(res);
		System.out.println(Character.isLetter(ch2));
		char ch3 ='#';
		System.out.println(Character.isLetterOrDigit(ch3));
		System.out.println(Character.isDigit(ch3));
		System.out.println(Character.isSpaceChar(ch3));
		
		
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase(ch2));

	}

}
