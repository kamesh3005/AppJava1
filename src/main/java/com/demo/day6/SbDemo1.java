package com.demo.day6;

public class SbDemo1 {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.length()); // number of characters -0
		System.out.println(sb1.capacity()); // capacity -16
		StringBuffer sb2 = new StringBuffer("Java");
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());

		int num = 567;
		sb2.append(num);
		System.out.println(sb2);
		System.out.println(sb2.length());
		double d1 = 23.563;
		boolean res = true;
		sb2.append(d1).append("Hello").append(res);
		System.out.println(sb2);

		sb2.insert(1, num);
		System.out.println(sb2);

		sb2.insert(3, "HAI");
		System.out.println(sb2);

		sb2.insert(1, res);
		System.out.println(sb2);

	}

}
