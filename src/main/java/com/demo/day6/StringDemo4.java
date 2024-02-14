package com.demo.day6;

public class StringDemo4 {

	public static void main(String[] args) {
		
		String str="Kamesh,Dilip,Aditi,Anusiya,Ravi,Harshit,Hariharan";
		
		String[] names =str.split(",");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			
		}
 
		
		int num=100;
		String str1 =String.valueOf(num);
		System.out.println(str1);
		
		String str2="Java is simple. Java is secure";
		
		String str3 =str2.replace('a', 'x');
		System.out.println(str3);
		
		System.out.println(str2.replaceAll("Java", "Python"));
		System.out.println(str2.replaceFirst("Java", "Python"));
		
		
	}

}
