package com.demo.day7;

public class WrapperDemo4 {

	public static void main(String[] args) {
		
		Integer intObj1 =  new Integer(7899);  //wrapper class
		
		int n1=100;  //primitive
		
	//assign object(integer object) to primtive data type	
		//auto unboxing  - remove the wrapper and  take only  value and assign to the variable
		int n2=intObj1;
		System.out.println(n2);
		
		
		//auto boxing
		//assign int primitive data type value to object
		int num1=8976;
		Integer  intObj2 =num1;
		
 
	}

}
