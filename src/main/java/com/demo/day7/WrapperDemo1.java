package com.demo.day7;

public class WrapperDemo1 {

	public static void main(String[] args) {

		Integer intObj1 = new Integer(123);
		System.out.println(intObj1);
		// Integer intObj2 = new Integer("335A5"); //NumberFormatException
		Integer intObj2 = new Integer("3355"); // NumberFormatException
		System.out.println(intObj2);

		int n1 = intObj1.intValue();
		byte b1 = intObj1.byteValue();
		short s1 = intObj1.shortValue();
		long l1 = intObj1.longValue();
		float f1 = intObj1.floatValue();
		double d1 = intObj1.doubleValue();

		System.out.println(n1);
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		;

	}

}
