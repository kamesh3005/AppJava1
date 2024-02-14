package com.demo.day2;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int []a,b;
		a=new int[5];
		b=new int[10];
		 int []arr =new int[5];
		 
		 int []numArr= {10,20,30,40,50,60};
		 
		 System.out.println(numArr.length);
		 
		 System.out.println(numArr[3]);;
		 //ArrayIndexOutOfBoundsException
		 //System.out.println(numArr[6]);
		 
		 System.out.println("end of Program");
		 
		 
		 System.out.println(numArr[0]);
		 System.out.println(numArr[1]);
		 System.out.println(numArr[2]);
		 
		 for (int i = 0; i < numArr.length; i++) {
			 System.out.println(numArr[i]);
	
		}

	 
 
	}

}
