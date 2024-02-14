package com.demo.day2;

import java.util.Scanner;

public class ArrayDemo2 {
	public static void main(String[] args) {
		 int []numArr= {10,20,30,40,50,60};
		 for (int num : numArr) {
			 System.out.println(num);
		}
		 System.out.println("------------");
		 for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i] +" is at index position " +i);
		}
		 System.out.println("--------------");
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter  number of values");
		 int n =sc.nextInt();
		 int []marks = new int[n];
		 //n --> array length
		 for (int i = 0; i < marks.length; i++) {
			 System.out.println("Enter  marks["+i+"] :");
			 marks[i]=sc.nextInt();
			
		}
		 System.out.println("-------------");
		 for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

		
	}

}
