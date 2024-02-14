package com.demo.day7;

public class WrapperDemo3 {

	public static void main(String[] args) {
		
		 //String to  Integer  Object
		
		Integer  obj1 =new Integer("344");
		
		Integer   obj2=  Integer.valueOf("3366");
		Integer obj3 = Integer.valueOf("1001", 2);
		System.out.println(obj3);
		
		Integer obj4= Integer.valueOf("32", 8);
		System.out.println(obj4);
 
		Integer obj5= Integer.valueOf("1A", 16);
		System.out.println(obj5);
		
		//Integer to  String
		Integer  obj =new Integer(7865);

		String s1 = obj.toString();
		System.out.println(s1);
		
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		
		int  n1=120,n2=456;
		
		
		int max =Integer.max(n1, n2);
		System.out.println("Maximum = "+max);
		System.out.println(Integer.min(n1, n2));
		System.out.println(Integer.sum(n1, n2));
		
		
	}

}
